package com.lesson.abstractiontask;

public abstract class GeometricFigure {

    abstract void area();
    abstract void perimeter();

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

