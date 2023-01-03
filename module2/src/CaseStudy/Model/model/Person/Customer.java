package CaseStudy.Model.model.Person;

public class Customer extends Person {
    private String customerType; //loại khách
    private String address; //địa chỉ

    public Customer(){

    }

    public Customer(String id, String name, String dateOfBirth, String sex, String numCMND, String numPhone, String email, String customerType, String address) {
        super(id, name, dateOfBirth, sex, numCMND, numPhone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
