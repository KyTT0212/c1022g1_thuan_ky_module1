package Array_Loop_statement;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args){
        int sum=0;
        int integer=1;
        int n=2;

        while (integer<100){
            for (int i = 1; i <=n ; i++) {
                if (n%i==0){
                    sum++;
                }
            }
            if (sum==2){
                System.out.print(n);
                System.out.println();
            }
            sum=0;
            n++;
            integer++;


        }


    }
}
