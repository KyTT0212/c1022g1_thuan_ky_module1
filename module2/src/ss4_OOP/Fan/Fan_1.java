package ss4_OOP.Fan;

public class Fan_1 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("Fan 1: " + fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        System.out.println("Fan 2: " + fan2.toString());

    }
}
