package org.example;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

import java.io.IOException;


public class ParamsTag extends TagSupport {
    private String a;
    private String b;


    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            out.print(String.format("String arg a: %s <br/>", a));
            out.print(String.format("String arg b: %s <br/>", b));

            out.print("<br/>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return EVAL_BODY_INCLUDE;
    }
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

}
