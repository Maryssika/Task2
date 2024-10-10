package com.example.task2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
public class Triugl implements Shape {
    private double side;
    private Color color;

    public Triugl(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        double height = side * Math.sqrt(3) / 2; // Высота равностороннего треугольника
        double[] xPoints = {100, 100 + side / 2, 100 + side};
        double[] yPoints = {100 + height, 100, 100 + height};
        gc.fillPolygon(xPoints, yPoints, 3);
    }

    @Override
    public void descriptor() {
        System.out.println("Треугольник");
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
