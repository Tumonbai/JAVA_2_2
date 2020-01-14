package com.company;

public class Square extends Figure {
    private int sideA;

    public Square(int sideA) {
        this.sideA = sideA;
    }
    public double calculatePerimeter() {
        return sideA*4;

    }

    @Override
    public String draw() {
        return null;
    }
}
