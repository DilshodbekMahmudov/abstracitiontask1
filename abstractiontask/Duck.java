package com.lesson.abstractiontask;

public class Duck extends Animal{
    @Override
    void sound() {
        System.out.println("Duck sound -> quack quack");
    }

    @Override
    void getName() {
        System.out.println("Duck Name -> Duck");
    }
}
