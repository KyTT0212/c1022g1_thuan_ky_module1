package ss6_Inheritance.Point2DAndPoint3D;

public class Test {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(5,7);
        System.out.println(point2D);
        point2D.setXY(4,8);
        System.out.println("after : "+point2D);


        Point3D point3D=new Point3D(5,7,9);
        System.out.println(point3D);
        point3D.setXYZ(2,4,6);
        System.out.println("after : "+point3D);

        point3D.setX(5.5f);
        point3D.setY(7.5f);
        point3D.setZ(6.8f);
        System.out.println("after 1 : "+point3D);

    }
}
