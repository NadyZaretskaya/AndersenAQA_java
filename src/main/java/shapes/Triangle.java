package shapes;

public class Triangle implements Shape {

    private double a, b, c;
    private String fillColor;
    private String borderColor;
    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double computePerimeter(){
        return Shape.trianglePerimeter(a, b, c);
    }

    @Override
    public double computeSquare() {
        double p = computePerimeter()/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Треугольник со сторонами: " + "a = " + a + ", b = " + b + ", c = " + c + "; \n" +
                "периметр = " + computePerimeter() + "; площадь = " + computeSquare() + "; \n" +
                "цвет заливки - " + fillColor + "; цвет границы' - " + borderColor + "\n";
    }

}
