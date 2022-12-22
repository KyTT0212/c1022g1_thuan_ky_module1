package baiTapCodegymModule2.Exeception.exception1;

import java.util.Scanner;

public class exception1Test extends exception1Check{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao 2 so thuc");
            System.out.println("Input a");
            double a = Integer.parseInt(sc.nextLine());
            System.out.println("Input b");
            double b = Integer.parseInt(sc.nextLine());

            exception1Check(a, b);
        }catch (NumberFormatException e){
            System.out.println("Gia tri nhap vao khong phai la so");
        } catch (exception1 e) {
            System.out.println("Phep chia khong hop le");
        }
        System.out.println("ket thuc chuong trinh");
    }
}
