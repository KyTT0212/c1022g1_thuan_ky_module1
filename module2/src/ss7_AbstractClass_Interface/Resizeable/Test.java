package ss7_AbstractClass_Interface.Resizeable;

public class Test {
    public static void main(String[] args) {
        Geometry[] geometry =new Geometry[3];
        geometry[0]=new Circle("pink",5.7);
        geometry[1]=new Rectangle("blue",5.9);
        geometry[2]=new Square("gray",2.2);
        System.out.println("truoc khi tang khich thuoc");
        geometry[0].resize(0);
        geometry[1].resize(0);
        geometry[2].resize(0);
        System.out.println("sau khi tang kich thuoc");
        geometry[0].resize(Math.floor(Math.random()*100+1));
        geometry[1].resize(Math.floor(Math.random()*100+1));
        geometry[2].resize(Math.floor(Math.random()*100+1));

    }
}
