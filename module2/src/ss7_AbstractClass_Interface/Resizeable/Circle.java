package ss7_AbstractClass_Interface.Resizeable;

public class Circle extends Geometry implements IResizeable {

    public double r;



    public Circle(String color) {
        super(color);
    }

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    @Override
    public double area() {
        return this.r * this.r * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println(area()*percent);
    }
}

