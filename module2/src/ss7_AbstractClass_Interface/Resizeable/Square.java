package ss7_AbstractClass_Interface.Resizeable;

public class Square extends Geometry implements IResizeable{
    public double edge;


    public Square(String color) {
        super(color);
    }

    public Square(String color, double edge) {
        super(color);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return this.edge*this.edge;
    }

    @Override
    public void resize(double percent) {
        System.out.println(area()*percent);
    }
}
