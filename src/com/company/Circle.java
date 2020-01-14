package com.company;

public class Circle extends Figure {
    int radius;
    final double PI = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }
    public double calculatePerimeter() {
        return 2*PI*radius;
    }

    @Override
    public String draw() {
        return null;
    }
}
