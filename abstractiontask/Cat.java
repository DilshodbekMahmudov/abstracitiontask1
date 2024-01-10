package com.lesson.abstractiontask;

public class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Cat sound->meow meow");
    }

    @Override
    void getName() {
        System.out.println("Cat Name -> Cat");
    }
}
