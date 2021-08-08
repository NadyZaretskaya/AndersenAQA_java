package shapes;
/*
Применяя интерфейсы написать программу расчета периметра и площади
геометрических фигур: круг, прямоугольник, треугольник. Задать для каждой
фигуры цвет заливки и цвет границы. Результат полученных характеристик [
Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в
консоль.
Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в
качестве дефолтных методов в интерфейсе.
 */

public class App {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3, "Зеленый", "Синий");
        Triangle triangle = new Triangle(5.5, 5.5, 5.5, "Белый", "Красный");
        Circle circle = new Circle(15, "Синий", "Красный");
        System.out.println(rectangle);
        System.out.println(triangle);
        System.out.println(circle);
    }
}
