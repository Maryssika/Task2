package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Angle implements Shape {
    private Color color;

    public Angle(Color color) {
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setStroke(color);
        gc.setLineWidth(10);
        gc.strokeLine(25, 25, 250, 250); // Первая линия
        gc.strokeLine(30, 25, 30, 250);   // Вторая линия
    }

    @Override
    public void descriptor() {
        System.out.println("Угол");
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
