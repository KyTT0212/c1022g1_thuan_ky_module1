package Method.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("input length arr");
        int size=Integer.parseInt(scanner.nextLine());
        int arr[]=new int[size];
        int arr1[]=new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("input arr["+i+"]");
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i <arr.length ; i++) {
            arr1[i]=arr[arr.length-1-i];
        }
        System.out.print(Arrays.toString(arr1));
    }
}
