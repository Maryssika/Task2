package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Straight implements Shape {
    private double x1, y1, x2, y2;
    private Color color;

    public Straight(double x1, double y1, double x2, double y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setStroke(color);
        gc.setLineWidth(2);
        gc.strokeLine(x1, y1, x2, y2);
    }

    @Override
    public void descriptor() {
        System.out.println("Прямая линия");
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
