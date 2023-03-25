package com.abhishek;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    private String brand;

    // constructor-arg in xml will use this constructor to initialize this ->
    // constructor injection
    // public Tyre(String brand) {
    // this.brand = brand;
    // }

    public String getBrand() {
        return brand;
    }

    // property tag in xml is using setter for value of brand -> setter injection
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "This is tyre";
    }
}
