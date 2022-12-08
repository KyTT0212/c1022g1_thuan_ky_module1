package baiTapCodegymModule2;

import java.util.Arrays;
import java.util.Scanner;

public class Nhap1MangTachMangChanLe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input length arr");
        int size=Integer.parseInt(scanner.nextLine());
        int arr[]=new int[size];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("input arr["+i+"]");
            arr[i]=Integer.parseInt(scanner.nextLine());
        }

        int arr1[]=new int[size];
        int arr2[]=new int[size];
        int kq=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==0){
                kq=arr[i];

            }else
                System.out.print("mang so le: "+ arr[i]);
        }
        System.out.println("mang so chan: "+kq);
    }
}
