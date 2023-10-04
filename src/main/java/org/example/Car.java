package org.example;

import java.awt.*;


public class Car {
    private String brand;
    private Color color;
    private String year;

    public Car(String brand, Color color, String year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }
}
