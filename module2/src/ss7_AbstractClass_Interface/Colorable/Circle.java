package ss7_AbstractClass_Interface.Colorable;

public class Circle extends Geometry {
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle(String color, boolean fill, double r) {
        super(color, fill);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double area(){
        return this.r*this.r*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", area=" + area()+
                '}';
    }
}
