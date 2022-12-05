package Array_Loop_statement;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args){
        int count=0;
        int n=2;
        int sum=0;

        while (sum<20){
            for (int i = 1; i <=n ; i++) {
                if (n%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(n);
                sum++;
            }
            n++;
            count=0;

        }


    }
}
