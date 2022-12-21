package ss15_ExceptionAndDebug;

import java.util.Scanner;

public class IllegalTriangleExceptionTest extends IllegalTriangleExceptionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 canh cua hinh tam giac");
        System.out.println("Nhap canh a");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap canh b");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap canh c");
        int c = Integer.parseInt(sc.nextLine());

        try {
            IllegalTriangleExceptionCheck(a,b,c);
        } catch (IllegalTriangleException e) {
            System.out.println("Day khong phai la canh cua tam giac : ");
        }
        System.out.println("a="+a+", b="+","+b+", c="+c);
    }
}
