package ss7_AbstractClass_Interface.Colorable;

public class Square extends Geometry implements IColorable{
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean fill, double edge) {
        super(color, fill);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double area(){
        return this.edge*this.edge;
    }


    @Override
    public void howToColor() {

    }
}
