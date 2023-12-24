package com.intooop;

import com.figures.Figure;
import com.figures.Square;
import com.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        startClasses();

    }
    public static void startClasses() {
        Figure figure = new Figure(3, 3);
        System.out.println(figure.getSideSize() + " " + figure.getSideNumber());

        Triangle triangle = new Triangle(3);
        System.out.println(triangle.getSideNumber()+" "+triangle.getSideSize());

        Square square = new Square(665);
        System.out.println(square.getSideNumber()+" "+square.getSideSize());
    }
}