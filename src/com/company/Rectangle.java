package com.company;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public double calculatePerimeter() {
        return (sideA+sideB) *2;
    }

    @Override
    public String draw() {
        return null;
    }
}
