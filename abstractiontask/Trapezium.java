package com.lesson.abstractiontask;

public class Trapezium extends GeometricFigure {
    @Override
    void area() {
        System.out.println("Trapezium area  SideA  :15");
        System.out.println("Trapezium area  SideB : 20 ");
        System.out.println("Trapezium area  High: 35  ");
    }

    @Override
    void perimeter() {
        System.out.println("Trapezium perimeter  SideA : 20 ");
        System.out.println("Trapezium perimeter   SideB : 40 ");
        System.out.println("Trapezium perimeter  High : 60");

    }
}
