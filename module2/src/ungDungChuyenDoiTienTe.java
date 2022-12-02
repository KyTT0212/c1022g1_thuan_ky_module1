import java.util.Scanner;

public class ungDungChuyenDoiTienTe {
    public static void main (String[] arga) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("moi ban nhap so tien (usd) : ");
        usd = sc.nextDouble();
        double quyDoi = usd * vnd;
        System.out.print("gia tri vnd sau quy doi : " + quyDoi);
    }
}
