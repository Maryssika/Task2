package com.example.laba6;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    protected Color color;
    protected double x, y;
    protected double width, height;

    // Конструктор
    public Shape(Color color) {
        this.color = color;
    }

    public abstract double area();

    // Абстрактный метод для рисования
    abstract void draw(GraphicsContext gr);

    // Метод для рисования в заданных координатах
    public void draw(GraphicsContext gr, double x, double y) {
        this.x = x;
        this.y = y;
        draw(gr);
    }

    // Метод для задания позиции
    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Метод для получения ширины (если нужно для правильного размещения фигур в ряд)
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Метод для получения цвета
    public Color getColor() {
        return color;
    }

    // Метод для клонирования фигуры
    public abstract Shape clone();
}