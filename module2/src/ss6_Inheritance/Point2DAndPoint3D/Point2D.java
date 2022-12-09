package ss6_Inheritance.Point2DAndPoint3D;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x , float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        float a[]={this.x,this.y};
        return a;
    }

//    ///Cach 1
//    @Override
//    public String toString() {
//        return "Point2D{" +
//                "x=" + x +
//                ", y=" + y +
//                '}';
//    }

    //Cach 2

    @Override
    public String toString() {
        return "Point2D{"+
                " x,y="+ Arrays.toString(getXY())+
                "}";
    }
}
