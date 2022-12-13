package ss7_AbstractClass_Interface.Resizeable;

public abstract class Geometry implements IResizeable {
    public String color;

    public abstract double area();

    public Geometry(String color) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
