package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle implements Shape {
    private double radius;
    private Color color;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(100, 100, radius * 2, radius * 2);
    }

    @Override
    public void descriptor() {
        System.out.println("Круг");
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
