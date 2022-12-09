package AccessModifierStatic.B;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("ky");
        student.setClasses("C10");
        System.out.println(student.getName() + "\n" + student.getClasses());


    }
}
