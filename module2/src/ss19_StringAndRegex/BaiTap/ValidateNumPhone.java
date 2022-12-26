package ss19_StringAndRegex.BaiTap;

import java.util.Scanner;

public class ValidateNumPhone {
    private static final String REGEX_NUMPHONE = "[(][8][4][)]-[(][0][0-9]{9}[)]";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại");
        String myNumPhone = sc.nextLine();

        System.out.println(myNumPhone.matches(REGEX_NUMPHONE));
    }
}
