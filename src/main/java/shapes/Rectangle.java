package shapes;

public class Rectangle implements Shape {

    private double a;
    private double b;
    private String fillColor;
    private String borderColor;
    public Rectangle(double a, double b, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double computePerimeter(){
        return Shape.rectanglePerimeter(a, b);
    }

    @Override
    public double computeSquare() {
        return (a * b);
    }

    @Override
    public String toString() {
        return "Прямоугольник со сторонами: " + "a = " + a + ", b = " + b + "; \n" +
                "периметр = " + computePerimeter() + "; площадь = " + computeSquare() + "; \n" +
                "цвет заливки - " + fillColor +  "; цвет границы' - " + borderColor + "\n";
    }

}
