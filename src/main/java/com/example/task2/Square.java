package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square implements Shape {
    private double side;
    private Color color;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillRect(100, 100, side, side);
    }

    @Override
    public void descriptor() {
        System.out.println("Квадрат");
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
