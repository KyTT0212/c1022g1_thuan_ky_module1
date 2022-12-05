package Array_Loop_statement;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("length arr1");
        int size1=Integer.parseInt(scanner.nextLine());
        int arr1[]= new int[size1];

        for (int i = 0; i <arr1.length ; i++) {
            System.out.print("input arr["+i+"]");
            arr1[i]=Integer.parseInt(scanner.nextLine());
        }

        System.out.print("length arr2");
        int size2=Integer.parseInt(scanner.nextLine());
        int arr2[]=new int[size2];

        for (int i = 0; i <arr2.length ; i++) {
            System.out.print("input arr2["+i+"]");
            arr2[i]=Integer.parseInt(scanner.nextLine());
        }

        int arr[][]={arr1,arr2};
        int max= arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.print("largest element in two dimensions"+max);
    }
}
