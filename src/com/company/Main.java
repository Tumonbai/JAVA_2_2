package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle = new Circle (3);
        System.out.println("Круг с периметром: " + circle.calculatePerimeter());

        Square square = new Square(4);
        System.out.println( "Квадрат с площадю: " + square.calculatePerimeter() );

    }
}
