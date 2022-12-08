package AccessModifierStatic.AccessModifier;

import java.awt.geom.Area;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double Area;

    public double getArea() {
        return Area = this.radius * this.radius * Math.PI;
    }
}
