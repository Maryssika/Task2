package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public interface Shape {
    void draw(GraphicsContext gr);

    void setColor(Color color);

    void descriptor();
}
