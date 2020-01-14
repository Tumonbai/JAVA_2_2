package com.company;

abstract public class Figure {
    private String name;

    public String getName() {
        return name;
    }
    public abstract double calculatePerimeter();
    public abstract String draw();
}
