package com.intooop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        startClasses();

    }
    public static void startClasses() {
        Animal animal = new Animal("Lol");
        System.out.println(animal.name);
    }
}