package ss6_Inheritance.CircleAndCylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("blue");
        circle.setRadius(5.5);
        System.out.println(circle);


        Cylinder cylinder = new Cylinder(3.0, "blue", 5);
        System.out.println(cylinder);
    }


}
