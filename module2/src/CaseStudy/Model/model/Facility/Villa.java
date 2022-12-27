package CaseStudy.Model.model.Facility;

public class Villa extends Furama {
    private String standard;
    private double swimmingArea;
    private int numFloors;

    public Villa() {
    }

    public Villa(String serviceName, int usableArea, double price, int peopleMaximum, String rentalType, String standard, double swimmingArea, int numFloors) {
        super(serviceName, usableArea, price, peopleMaximum, rentalType);
        this.standard = standard;
        this.swimmingArea = swimmingArea;
        this.numFloors = numFloors;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public double getSwimmingArea() {
        return swimmingArea;
    }

    public void setSwimmingArea(double swimmingArea) {
        this.swimmingArea = swimmingArea;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standard='" + standard + '\'' +
                ", swimmingArea=" + swimmingArea +
                ", numFloors=" + numFloors +
                '}';
    }
}
