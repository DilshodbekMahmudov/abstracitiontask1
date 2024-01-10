package com.lesson.abstractiontask;

public class Triangle extends GeometricFigure{
    @Override
    void area() {
        System.out.println("Triangle area SideA : 20 ");
        System.out.println("Triangle area SideB: 25 ");
        System.out.println("Triangle area SideC : 27 ");
    }

    @Override
    void perimeter() {
        System.out.println("Triangle perimeter SideA: 45 ");
        System.out.println("Triangle perimeter SideB : 50 ");
        System.out.println("Triangle perimeter SideC : 30 ");
    }
}
