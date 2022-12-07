package ss4_OOP.QuadraticEquation;

public class QuadraticEquation_1 {
    public static void main(String[] args) {
        QuadraticEquation QE = new QuadraticEquation();
        QE.setA(1);
        System.out.println("a = " + QE.getA());
        QE.setB(3);
        System.out.println("b = " + QE.getB());
        QE.setC(1);
        System.out.println("c = " + QE.getC());

        System.out.println("delta = " + QE.getDiscriminant());

        if (QE.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (QE.getDiscriminant() == 0) {
            System.out.println("x1=x2=" + QE.getDoubleSolution());
        } else if (QE.getDiscriminant() > 0) {
            System.out.println("phương trình có 2 nghiệm phân biệt : " + "r1 = " + QE.getRoot1() + " r2 = " + QE.getRoot2());
        }

    }
}
