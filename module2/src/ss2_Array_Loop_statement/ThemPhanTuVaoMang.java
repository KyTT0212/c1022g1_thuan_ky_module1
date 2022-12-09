package Array_Loop_statement;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("length arr");
        int size=Integer.parseInt(sc.nextLine());
        int arr[]=new int[size+1];

        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.print("input arr["+i+"]");
            arr[i]=Integer.parseInt(sc.nextLine());
        }

        System.out.print("number add");
        int num=Integer.parseInt(sc.nextLine());
        System.out.print("index add arr");
        int index=Integer.parseInt(sc.nextLine());

        for (int i = arr.length-1; i >index ; i--) {
            arr[i]=arr[i-1];
        }
        arr[index]=num;
        //
        System.out.println(Arrays.toString(arr));
    }
}
