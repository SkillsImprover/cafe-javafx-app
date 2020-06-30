package com.skillsimprover.cafeapp;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("Welcome to our cafe");
        System.out.println("Soup of the day only for " + random.nextInt(100) + "$");
    }
}
