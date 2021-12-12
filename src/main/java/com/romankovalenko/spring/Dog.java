package com.romankovalenko.spring;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet{
//    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    private void init(){
        System.out.println("Class Dog : init method");
    }

    private void destroy(){
        System.out.println("Class Dog : destroy method");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}
