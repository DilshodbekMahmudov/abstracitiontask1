package com.lesson.abstractiontask;

public class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog sound -> bow bow");
    }

    @Override
    void getName() {
        System.out.println("Dog Name -> Reks");
    }
}
