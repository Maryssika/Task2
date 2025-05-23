package Figyri;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс ShapeGroup реализует паттерн Компоновщик (Composite), позволяя
 * работать с группой фигур как с единым объектом.
 * Наследуется от абстрактного класса Shape.
 */
public class ShapeGroup extends Shape {
    // Список для хранения фигур, входящих в группу
    private List<Shape> shapes = new ArrayList<>();

    /**
     * Конструктор группы фигур
     * @param color цвет группы (наследуется от Shape)
     */
    public ShapeGroup(Color color) {
        super(color); // Передаем цвет в родительский класс
    }

    /**
     * Добавляет фигуру в группу
     * @param shape фигура для добавления
     */
    public void add(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Отрисовывает все фигуры в группе
     * @param gr графический контекст для рисования
     */
    @Override
    public void draw(GraphicsContext gr) {
        // Рекурсивно вызываем draw() для каждой фигуры в группе
        for (Shape shape : shapes) {
            shape.draw(gr);
        }
    }

    /**
     * Вычисляет суммарную площадь всех фигур в группе
     * @return общая площадь группы фигур
     */
    @Override
    public double area() {
        double totalArea = 0;
        // Суммируем площади всех фигур в группе
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }

    /**
     * Создает глубокую копию группы фигур
     * @return копия группы фигур
     */
    @Override
    public Shape clone() {
        // Создаем новую группу с тем же цветом
        ShapeGroup group = new ShapeGroup(this.color);
        // Клонируем каждую фигуру и добавляем в новую группу
        for (Shape shape : shapes) {
            group.add(shape.clone());
        }
        return group;
    }
}