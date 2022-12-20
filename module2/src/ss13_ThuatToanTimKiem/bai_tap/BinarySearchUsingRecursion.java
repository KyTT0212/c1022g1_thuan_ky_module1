package ss13_ThuatToanTimKiem.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length arr :");
        int length = Integer.parseInt(sc.nextLine());
        int arr[] = new int[length];


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input arr[" + i + "]");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
//        chuyen thanh mang
        System.out.println(Arrays.toString(arr));
//        sắp xếp các phần tử theo thứ tự tăng dần
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println("Input value need to find");
        int value = Integer.parseInt(sc.nextLine());
        System.out.println("Input value need to find in index :"+binarySearch(arr,0,arr.length-1,value));

    }

    private static int binarySearch(int[] arr, int left, int right, int value) {

        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (value > arr[mid]) {
                return binarySearch(arr, mid + 1, right, value);
            } else {
                return binarySearch(arr, left , mid - 1, value);
            }
        }
        return -1;
    }

}
