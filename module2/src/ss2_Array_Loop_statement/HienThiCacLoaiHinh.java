package Array_Loop_statement;

public class HienThiCacLoaiHinh {
    public static void main(String[] args){
        //hinh chu nhat
        for(int i=1;i<=3;i++){
            for(int j=1;j<=7;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //tam giac vuong(duoi_trai)
        for (int i = 1; i <=5 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //tam giac vuong(tren_trai)
        for (int i = 5; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
