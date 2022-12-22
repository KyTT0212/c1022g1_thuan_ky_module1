package CaseStudy.Task2.Person;

public class Customer extends Person {
    private int customerIsCode;  //mã khách hàng
    private int numberOfRentalDays;  //số ngày thuê
    private int day;
    private int month;
    private int year;

    public Customer(int customerIsCode) {
        this.customerIsCode = customerIsCode;
    }

    public Customer(int id, String name, boolean sex, int customerIsCode) {
        super(id, name, sex);
        this.customerIsCode = customerIsCode;
    }

    public int getCustomerIsCode() {
        return customerIsCode;
    }

    public void setCustomerIsCode(int customerIsCode) {
        this.customerIsCode = customerIsCode;
    }

    public int getNumberOfRentalDays() {
        return numberOfRentalDays;
    }

    public void setNumberOfRentalDays(int numberOfRentalDays) {
        this.numberOfRentalDays = numberOfRentalDays;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String DayIn(){
        return getDay()+"/"+getMonth()+"/"+getYear();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerIsCode=" + customerIsCode +
                ", numberOfRentalDays=" + numberOfRentalDays +
                ", DayIn=" + DayIn()+
                '}';
    }
}
