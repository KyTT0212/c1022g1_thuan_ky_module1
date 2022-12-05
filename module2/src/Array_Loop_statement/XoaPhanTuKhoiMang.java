package Array_Loop_statement;

import java.sql.Array;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap so phan tu");
        int size=Integer.parseInt(sc.nextLine());
        int arr[]= new int[size];
        System.out.print("nhap phan tu can xoa");
        int x=Integer.parseInt(sc.nextLine());

        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap phan tu arr["+i+"]");
            arr[i]=Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i <arr.length ; i++) {
            if (x==arr[i]){
                arr[i]=0;
                for (int j = i; j <arr.length-1 ; j++) {
                    arr[j]=arr[j+1];
                }
               arr[arr.length-1]=0;
                i--;
            }
        }


    }
}
