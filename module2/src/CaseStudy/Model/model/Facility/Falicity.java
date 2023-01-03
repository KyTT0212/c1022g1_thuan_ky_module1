package CaseStudy.Model.model.Facility;

public abstract class Falicity {
   private String serviceName;//Tên dịch vụ
   private String usableArea;//Diện tích sử dụng
   private String price;//Chi phí
   private String peopleMaximum;//Số lượng người tối đa
   private String rentalType;//Kiểu thuê(theo ngày tháng năm)

    public Falicity() {
    }

    public Falicity(String serviceName, String usableArea, String price, String peopleMaximum, String rentalType) {
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

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPeopleMaximum() {
        return peopleMaximum;
    }

    public void setPeopleMaximum(String peopleMaximum) {
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
