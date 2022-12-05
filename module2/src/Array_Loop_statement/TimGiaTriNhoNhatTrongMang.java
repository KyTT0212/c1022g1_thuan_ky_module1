package Array_Loop_statement;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("input size arr");
        int size=Integer.parseInt(scanner.nextLine());
        int arr[]=new int[size];

        for (int i = 0; i <arr.length ; i++) {
            System.out.print("input arr["+i+"]");
            arr[i]=Integer.parseInt(scanner.nextLine());

        }

        int min=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("smallest value"+min);
    }
}
