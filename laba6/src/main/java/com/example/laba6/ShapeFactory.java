package com.example.laba6;
import javafx.scene.paint.Color;
public class ShapeFactory {
    public Shape createShape(String shapeType, Color color, double... params) {
        switch (shapeType.toLowerCase()) {
            case "square":
                return new Square(color, params[0]);
            case "triangle":
                return new Triangle(color, params[0], params[1]);
            case "circle":
                return new Circle(color, params[0]);
            default:
                throw new IllegalArgumentException("Неверный тип фигуры: " + shapeType);
        }
    }
}
