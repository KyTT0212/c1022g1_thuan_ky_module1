package CaseStudy.Task2.Facility;

public class Villa extends Facility {
    int floor;
    int capacity; //sức chứa

    public Villa(int floor, int capacity) {
        this.floor = floor;
        this.capacity = capacity;
    }

    public Villa(String color, double area, double width, double height, double price, int floor,int capacity) {
        super(color, area, width, height, price);
        this.floor = floor;
        this.capacity = capacity;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String pool(){
        return "hồ bơi";
    }

    public String rooftop(){
        return "sân thượng";
    }

    public String diningRoom(){
        return "phòng ăn";
    }

    public String livingRoom(){
        return "phòng khách";
    }

}
