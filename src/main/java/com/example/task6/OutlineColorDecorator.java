package com.example.task6;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class OutlineColorDecorator extends ShapeDecorator {
    private Color outlineColor;

    public OutlineColorDecorator(Shape decoratedShape, Color outlineColor) {
        super(decoratedShape);
        this.outlineColor = outlineColor;
    }

    @Override
    public void draw(GraphicsContext gr, double x, double y, double opacity) {
        gr.setStroke(outlineColor);
        super.draw(gr, x, y, opacity);
        gr.stroke(); // Убедитесь, что контур отрисовывается
    }
}