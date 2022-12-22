package CaseStudy.Task2.Person;

public class Employee extends Person {
    private int codeEmployee;
    private double hourlyWage; //lương giờ
    private float hour; //thời gian làm(tiếng)

    public Employee() {
    }

    public Employee(int id, String name, boolean sex, int codeEmployee) {
        super(id, name, sex);
        this.codeEmployee = codeEmployee;
    }

    public int getCodeEmployee() {
        return codeEmployee;
    }

    public void setCodeEmployee(int codeEmployee) {
        this.codeEmployee = codeEmployee;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }

    public double wage(){
        return getHour()*getHourlyWage();
    }
}
