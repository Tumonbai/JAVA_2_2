package com.company;

public class Square extends Figure {
    private int sideA;

    public Square(String name, int sideA) {
        super(name);
        this.sideA=sideA;
    }
    public double calculatePerimeter() {
        return sideA*4;

    }

    @Override
    public String draw() {
        return null;
    }
}
