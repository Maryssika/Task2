package com.example.task6;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public abstract class ShapeDecorator extends Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        super(decoratedShape.size, decoratedShape.color);
        this.decoratedShape = decoratedShape;
        this.x = decoratedShape.getX(); // Сохраняем x
        this.y = decoratedShape.getY(); // Сохраняем y
    }

    @Override
    public void draw(GraphicsContext gr, double x, double y, double opacity) {
        decoratedShape.draw(gr, x, y, opacity);
    }

    @Override
    public Shape clone() {
        return decoratedShape.clone();
    }
}