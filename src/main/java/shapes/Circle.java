package shapes;

public class Circle implements Shape {

    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double computeSquare() {
        return Math.PI * (radius * radius);
    }

    public double computePerimeter(){
        return Shape.circlePerimeter(radius);
    }

    @Override
    public String toString() {
        return "Круг радиусом " + "r = " + radius + "\n" +
                "длина окружности = " + computePerimeter() + "; площадь = " + computeSquare() + "; \n" +
                "цвет заливки - " + fillColor + "; цвет границы' - " + borderColor + "\n";
    }
}
