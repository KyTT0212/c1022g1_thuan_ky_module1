package ss14_SortingAlogorithms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size arr");
        int length = Integer.parseInt(sc.nextLine());
        int arr[] = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("input arr[" + i + "]");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("mang ban dau : " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("mang sau khi sap xep tang: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            int k = i - 1;
            while (k >= 0 && array[k] > x) {
                array[k + 1] = array[k];
                --k;
            }
            array[k + 1] = x;
        }
    }

}
