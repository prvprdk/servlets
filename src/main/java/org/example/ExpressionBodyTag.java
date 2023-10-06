package org.example;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ExpressionBodyTag extends BodyTagSupport {
    @Override
    public int doAfterBody() throws JspException {
        String str = getBodyContent().getString();
        JspWriter writer = getBodyContent().getEnclosingWriter();

        String tableBody = Arrays.stream(str.split("\\.")
        ).map(sentence -> {
            String[] parts = sentence.split(" - ");
            return String.format("<tr><td>%s</td><td>%s</td></tr>", parts[0], parts[1]);
        }).collect(Collectors.joining());

        try {
            writer.write("<table>");
            writer.write(tableBody);
            writer.write("</table>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return EVAL_PAGE;
    }
}
