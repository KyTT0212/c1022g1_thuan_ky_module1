package CaseStudy.Model.model.Person;

public class Person {

    private int id;
    private String name;
    private String dateOfBirth;
    private boolean sex = false;  //nam
    private long numCMND;
    private long numPhone;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String dateOfBirth, boolean sex, long numCMND, long numPhone, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.numCMND = numCMND;
        this.numPhone = numPhone;
        this.email = email;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public long getNumCMND() {
        return numCMND;
    }

    public void setNumCMND(long numCMND) {
        this.numCMND = numCMND;
    }

    public long getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(long numPhone) {
        this.numPhone = numPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", sex=" + sex +
                ", numCMND=" + numCMND +
                ", numPhone=" + numPhone +
                ", email='" + email + '\'' +
                '}';
    }
}
