package Array_Loop_statement;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("length arr1");
        int size1=Integer.parseInt(sc.nextLine());
        int arr1[]=new int[size1];
        System.out.print("length arr2 ");
        int size2=Integer.parseInt(sc.nextLine());
        int arr2[]=new int[size2];
        int size=arr1.length+arr2.length;
        int arr[]=new int[size];

        for (int i = 0; i <arr1.length ; i++) {
            System.out.print("nhap phan tu arr1["+i+"]");
            arr1[i]=Integer.parseInt(sc.nextLine());
            arr[i]=arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print("nhap phan tu arr2["+i+"]");
            arr2[i]=Integer.parseInt(sc.nextLine());
            arr[i+arr1.length]=arr2[i];
        }
        System.out.print(arr);


    }
}
