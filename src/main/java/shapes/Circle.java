package shapes;

public class Circle extends BaseShape implements Perimeter, Area {

    private double radius;

    public Circle(double radius, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    @Override
    public double computeSquare() {
        return Math.PI * (radius * radius);
    }

    public double computePerimeter(){
        return Perimeter.circlePerimeter(radius);
    }

    @Override
    public String toString() {
        return "Круг радиусом " + "r = " + radius + "\n" +
                "длина окружности = " + computePerimeter() + "; площадь = " + computeSquare() + "; \n" +
                "цвет заливки - " + getFillColor() + "; цвет границы - " + getBorderColor() + "\n";
    }
}
