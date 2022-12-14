package ss10_DSA;

public class Test {
    public static class ClassStudent{
        private int id;
        private String name;

        public ClassStudent() {
        }

        public ClassStudent(int id, String name) {
            this.id = id;
            this.name = name;
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

        @Override
        public String toString() {
            return "ClassStudent{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        ClassStudent classStudent1=new ClassStudent(1,"Hùng");
        ClassStudent classStudent2=new ClassStudent(2,"Quốc");
        ClassStudent classStudent3=new ClassStudent(3,"Nghĩa");
        ClassStudent classStudent4=new ClassStudent(4,"Phong");
        ClassStudent classStudent5=new ClassStudent(5,"Việt");
        MyArrayList<ClassStudent> studentMyArrayList =new MyArrayList<>(10);
        studentMyArrayList.add(classStudent1);
        studentMyArrayList.add(classStudent2);
        studentMyArrayList.add(classStudent3);
        studentMyArrayList.add(classStudent4);
        studentMyArrayList.add(classStudent5);
        System.out.println(studentMyArrayList.size());
        for (int i = 0; i <studentMyArrayList.size() ; i++) {
            System.out.println(studentMyArrayList.get(i).toString());
        }
    }
}
