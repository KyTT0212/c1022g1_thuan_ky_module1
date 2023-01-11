package Bai1;

import java.util.Scanner;

public class UocSoNguyenDuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        do {
            System.out.println("Nhập số");
            num = Integer.parseInt(sc.nextLine());
        } while (num >= 5000 || num <= 0);
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }
        System.out.println("Tổng các số ước chẵn là : " + sum);
    }
}
