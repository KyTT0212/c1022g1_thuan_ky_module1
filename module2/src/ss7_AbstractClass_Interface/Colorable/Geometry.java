package ss7_AbstractClass_Interface.Colorable;

public abstract class Geometry {
    private String color;

    private boolean fill;

    public Geometry() {
    }

    public Geometry(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
}
