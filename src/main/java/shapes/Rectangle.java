package shapes;

public class Rectangle extends BaseShape implements Perimeter, Area {

    private double a;
    private double b;
    public Rectangle(double a, double b, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.a = a;
        this.b = b;
    }

    public double computePerimeter(){
        return Perimeter.rectanglePerimeter(a, b);
    }

    @Override
    public double computeSquare() {
        return (a * b);
    }

    @Override
    public String toString() {
        return "Прямоугольник со сторонами: " + "a = " + a + ", b = " + b + "; \n" +
                "периметр = " + computePerimeter() + "; площадь = " + computeSquare() + "; \n" +
                "цвет заливки - " + getFillColor() +  "; цвет границы - " + getBorderColor() + "\n";
    }

}
