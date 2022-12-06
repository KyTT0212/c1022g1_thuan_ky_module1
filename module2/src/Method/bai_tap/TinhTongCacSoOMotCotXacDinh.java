package Method;

import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("input length arr1");
        int size1=Integer.parseInt(scanner.nextLine());
        int arr1[]=new int[size1];

        for (int i = 0; i <arr1.length ; i++) {
            System.out.print("input arr1["+i+"]");
            arr1[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.print("input length arr2");
        int size2=Integer.parseInt(scanner.nextLine());
        int arr2[]=new int[size2];

        for (int i = 0; i <arr2.length ; i++) {
            System.out.print();
        }
    }
}
