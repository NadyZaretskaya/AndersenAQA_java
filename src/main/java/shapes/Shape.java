package shapes;

public interface Shape {

    double computeSquare();

    static double rectanglePerimeter(double a, double b) {
        double perimeter = (a + b) * 2;
        return perimeter;
    }

    static double trianglePerimeter(double a, double b, double c) {
        double perimeter = a + b + c;
        return perimeter;
    }

    static double circlePerimeter(double a) {
        double perimeter = Math.PI * 2 * a;
        return perimeter;
    }

}
