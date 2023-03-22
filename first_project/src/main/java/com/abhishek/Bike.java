package com.abhishek;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

    public void drive() {
        System.out.println("Someone is riding bike...");
    }

}
