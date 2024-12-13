package com.example.task6;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class FillTypeDecorator extends ShapeDecorator {
    private Paint fillType; // Изменено на Paint

    public FillTypeDecorator(Shape decoratedShape, Paint fillType) { // Изменено на Paint
        super(decoratedShape);
        this.fillType = fillType;
    }

    @Override
    public void draw(GraphicsContext gr, double x, double y, double opacity) {
        gr.setFill(fillType);
        super.draw(gr, x, y, opacity);
        gr.fill(); // Убедитесь, что заливка отрисовывается
    }
}