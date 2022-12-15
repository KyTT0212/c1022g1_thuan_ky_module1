package ss11_DSAStackQueue.ChuyenTuThapPhanSangNhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> myArrInt= new Stack<>() ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input hệ thập phân");
        int decimal = Integer.parseInt(scanner.nextLine());
        int sum=0;

//        hệ nhị phân
        while (decimal>0){
            sum=decimal%2;
            myArrInt.push(sum);
            decimal=decimal/2;
        }
        int n =myArrInt.size();
        for (int i = 0; i <n ; i++) {
            System.out.print(myArrInt.pop());
        }

    }
}
