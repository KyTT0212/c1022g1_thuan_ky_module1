package CaseStudy.Model.model.Person;

public class Employee extends Person {
    private String level;
    private String position;
    private String wage;

    public Employee(String id, String name, String dateOfBirth, String sex, String numCMND, String numPhone, String email, String customerType, String address) {
    }

    public Employee(String id, String name, String dateOfBirth, String sex, String numCMND, String numPhone, String email, String level, String position, String wage) {
        super(id, name, dateOfBirth, sex, numCMND, numPhone, email);
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                "} " + super.toString();
    }
}
