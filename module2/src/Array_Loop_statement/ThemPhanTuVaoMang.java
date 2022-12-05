package Array_Loop_statement;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("length arr");
        int size=Integer.parseInt(sc.nextLine());
        int arr[]=new int[size];

        for (int i = 0; i <arr.length ; i++) {
            System.out.print("nhap phan tu arr["+i+"]");
            arr[i]=Integer.parseInt(sc.nextLine());
        }

        System.out.print("number add");
        int num=Integer.parseInt(sc.nextLine());
        System.out.print("index add arr");
        int index=Integer.parseInt(sc.nextLine());




    }
}
