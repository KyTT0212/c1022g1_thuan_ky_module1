package Method.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input characters");
        //
        char characters=scanner.nextLine().charAt(0);
        System.out.println("input string");
        String str=scanner.nextLine();
        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            //
            if (characters==str.charAt(i)){
                count++;
            }
        }
        System.out.print(count);
    }
}
