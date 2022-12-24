package ss17_IOBinaryFileAndSerialization.BaiTap.QuanLiSanPhamLuuRaFileNhiPhan.Model;

public class ProductInformation {
    private int id;
    private String name;
    private int dateOfManufacture;
    private int monthOfManufacture;
    private int yearOfManufacture;
    private double price;

    public ProductInformation(int newId, String newName, int newdateOfManufacture, int newmonthOfManufacture, int newyearOfManufacture, double newPrice, String productionTime) {
    }

    public ProductInformation(int id, String name, int dateOfManufacture, int monthOfManufacture, int yearOfManufacture,double price) {
        this.id = id;
        this.name = name;
        this.dateOfManufacture = dateOfManufacture;
        this.monthOfManufacture = monthOfManufacture;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(int dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getMonthOfManufacture() {
        return monthOfManufacture;
    }

    public void setMonthOfManufacture(int monthOfManufacture) {
        this.monthOfManufacture = monthOfManufacture;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String productionTime(){
        return getDateOfManufacture()+"/"+getMonthOfManufacture()+"/"+getYearOfManufacture();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductInformation{" +
                "id=" + id +
                ", name='" + name + '\'' +
//                ", dateOfManufacture=" + dateOfManufacture +
//                ", monthOfManufacture=" + monthOfManufacture +
//                ", yearOfManufacture=" + yearOfManufacture +
                ", productionTime=" + productionTime() +
                ", price=" + price +
                '}';
    }
}
