package shapes;

public class Triangle extends BaseShape implements Perimeter, Area {

    private double a, b, c;
    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double computePerimeter(){
        return Perimeter.trianglePerimeter(a, b, c);
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
                "цвет заливки - " + getFillColor() + "; цвет границы - " + getBorderColor() + "\n";
    }

}
