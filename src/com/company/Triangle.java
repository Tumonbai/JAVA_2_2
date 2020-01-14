package com.company;

public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double  calculatePerimeter() {
        return sideA+sideB+sideC;

    }

    @Override
    public String draw() {
        return null;
    }
}
