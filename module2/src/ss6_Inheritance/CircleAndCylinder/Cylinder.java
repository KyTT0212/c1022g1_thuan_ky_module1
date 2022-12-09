package ss6_Inheritance.CircleAndCylinder;

//hinh tru
public class Cylinder extends Circle {
    private double height;//chieu cao

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {//the tich
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + ',' +
                " volume=" + this.getVolume() +
                '}';
    }
}
