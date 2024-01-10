package com.lesson.abstractiontask;

public class Result {

    public static void main(String[] args) {

        GeometricFigure triangle = new Triangle();
        GeometricFigure trapezium = new Trapezium();
        GeometricFigure rectangle = new Rectangle();

        triangle.area();
        triangle.perimeter();
        trapezium.area();
        trapezium.perimeter();
        rectangle.area();
        rectangle.perimeter();

    }
}
