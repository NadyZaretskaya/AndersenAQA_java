package shapes;

public abstract class BaseShape {
    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    private String fillColor;
    private String borderColor;

    public BaseShape(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
}
