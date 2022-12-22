package CaseStudy.Task2.Facility;

public class Facility {
    private String color;
    private double area;
    private double width;
    private double height;
    private  double price;



    public Facility() {
    }

    public Facility(String color, double area, double width, double height,double price) {
        this.color = color;
        this.area = area;
        this.width = width;
        this.height = height;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.height*this.width;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "color='" + color + '\'' +
                ", area=" + area +
                ", width=" + width +
                ", height=" + height +
                ", price=" + price +
                '}';
    }
}
