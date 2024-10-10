package com.example.task2;

import javafx.scene.paint.Color;

public class ShapeFactor {
    public Shape createShape(int numberOfSides) {

        switch (numberOfSides) {
            case 0:
                return new Circle(100, Color.PINK);
            case 1:
                return new Straight(100, 100, 300, 300, Color.RED);
            case 2:
                return new Angle(Color.GOLD);
            case 3:
                return new Triugl(100, Color.GREEN);
            case 4:
                return new Square(100, Color.BLUE);
            case 5:
                return new Pytiugl(100, Color.OLIVEDRAB);
            default:
                return null;
        }
    }
}