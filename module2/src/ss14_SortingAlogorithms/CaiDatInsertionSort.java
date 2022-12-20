package ss14_SortingAlogorithms;

import java.util.Arrays;
import java.util.Scanner;

public class CaiDatInsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int length = Integer.parseInt(sc.nextLine());
        int arr[] = new int[length];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Nhap arr"+i+"]");
            arr[i] = Integer.parseInt( sc.nextLine());
        }
        System.out.println("Mang ban dau : " +Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Mang sau khi sap xep giam : "+ Arrays.toString(arr));
    }

    public static void  insertionSort(int[] list){
        for (int i = 1; i <list.length ; i++) {
            int x = list[i];
            int k = i-1;
            while (k>=0 && list[k]< x){
                list[k+1] =list[k];
                --k;
            }
            list[k+1]=x;
        }
    }
}
