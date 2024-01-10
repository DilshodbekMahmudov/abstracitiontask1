package com.lesson.abstractiontask;

public class Rectangle extends GeometricFigure{
    @Override
    void area() {
        System.out.println("Rectangle area SideA : 21 ");
        System.out.println("Rectangle area SideB :22 ");
    }

    @Override
    void perimeter() {
        System.out.println("Rectangle perimeter  SideA :30");
        System.out.println("Rectangle perimeter  SideB :40");

    }
}
