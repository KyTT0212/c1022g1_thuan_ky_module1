package ss11_DSAStackQueue.DaoNguocPhanTuTrongMangSuDungStack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> myArrInt= new Stack<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap do dai n");
        int n = scanner.nextInt();
        int[] arr= new int[n];

        for (int i = 0; i <n ; i++) {
            System.out.println("Nhap phan tu arr["+i+"]");
            arr[i]= scanner.nextInt();
            myArrInt.push(arr[i]);
        }
        System.out.println(myArrInt);

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=myArrInt.pop();
        }
        System.out.println(Arrays.toString(arr));



    }

}
