package baiTapCodegymModule2.Exeception.exception2;

import java.util.Arrays;
import java.util.Scanner;

public class exception2Test extends exception2Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input length arr");
        int length = Integer.parseInt(sc.nextLine());
        int arr[] = new int[length];
        int i=0;

        try {
            for (; i < arr.length; i++) {
                System.out.println("Input arr[" + i + "]");
                arr[i] = Integer.parseInt(sc.nextLine());

                if (arr[i] == 100) {
                    exception2Check();
                }
            }
        } catch (exception2 e) {

        }
        System.out.println("arr"+ Arrays.toString(arr));
        System.out.println("ket thuc chuong trinh");
    }
}
