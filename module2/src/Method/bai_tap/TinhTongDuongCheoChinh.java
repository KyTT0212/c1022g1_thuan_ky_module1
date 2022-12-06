package Method.bai_tap;

import java.util.Scanner;

public class TinhTongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("input length arr");
        int size=Integer.parseInt(scanner.nextLine());
        int arr[][]=new int[size][size];
        int sum=0;

        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                System.out.println("input arr["+i+"]["+j+"]");
                arr[i][j]=Integer.parseInt(scanner.nextLine());

                if(i==j){
                   sum+=arr[i][j];
                }
            }
        }
        System.out.print(sum);
    }
}
