package com.romankovalenko.spring;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
