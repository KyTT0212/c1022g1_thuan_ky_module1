package ss7_AbstractClass_Interface.Colorable;

public class Rectangle extends Geometry implements IColorable {
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(String color, boolean fill, double height,double width) {
        super(color, fill);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area(){

    }
    @Override
    public void howToColor() {

    }
}
