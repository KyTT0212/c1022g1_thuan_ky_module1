package ss4_OOP.QuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return ((this.b * this.b) - 4 * this.a * this.c);
    }

    public double getDoubleSolution() {
        return (-this.b / (2 * this.a));
    }

    public double getRoot1() {
        return ((-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a));
    }

    public double getRoot2() {
        return ((-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a));
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }


}
