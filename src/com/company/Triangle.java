package com.company;

public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(String name, int sideA, int sideB, int sideC) {
        super(name);
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
