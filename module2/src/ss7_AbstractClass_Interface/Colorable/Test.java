package ss7_AbstractClass_Interface.Colorable;

public class Test {
    public static void main(String[] args) {
        Geometry[] geometrys =new Geometry[3];
        geometrys[0]=new Square("red",true,5.7);
        geometrys[1]=new Circle("pink",false,8);
        geometrys[2]=new Rectangle("gray",false,4,7);

        for (Geometry geometry : geometrys){
            if (geometry instanceof Square){
                IColorable square1=(Square) geometry;
                System.out.println(geometry);
                square1.howToColor();
                System.out.println();
            }
            if (geometry instanceof Rectangle){
                System.out.println(geometry);
            }
            if (geometry instanceof Circle){
                System.out.println(geometry);
            }
        }
    }
}
