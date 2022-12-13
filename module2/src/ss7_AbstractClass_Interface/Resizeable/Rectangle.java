package ss7_AbstractClass_Interface.Resizeable;

public class Rectangle extends Geometry implements IResizeable {
    public double height;
    public double width;



    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(String color, double height) {
        super(color);
        this.height = height;
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

    @Override
    public double area() {
        return this.height*this.width;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println(area()*percent);
    }
}
