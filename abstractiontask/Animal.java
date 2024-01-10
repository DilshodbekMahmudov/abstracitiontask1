package com.lesson.abstractiontask;

public abstract class Animal {
    abstract void sound();
    abstract void getName();

    public static void main(String[] args) {

        Animal dog=new Dog();
        Animal duck=new Duck();
        Animal cat=new Cat();

        dog.sound();
        dog.getName();
        duck.sound();
        duck.getName();
        cat.sound();
        cat.getName();

    }
}
