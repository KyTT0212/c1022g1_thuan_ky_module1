package CaseStudy.Model.model.Facility;

public abstract class Furama {
   private String serviceName;
   private int usableArea;
   private double price;
   private int peopleMaximum;
   private String rentalType;

    public Furama() {
    }

    public Furama(String serviceName, int usableArea, double price, int peopleMaximum, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.price = price;
        this.peopleMaximum = peopleMaximum;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPeopleMaximum() {
        return peopleMaximum;
    }

    public void setPeopleMaximum(int peopleMaximum) {
        this.peopleMaximum = peopleMaximum;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", price=" + price +
                ", peopleMaximum=" + peopleMaximum +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
