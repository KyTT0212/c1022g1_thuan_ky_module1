package baiTapCodegymModule2.Exeception.exception1;

public class exception1Check {
    public static void exception1Check(double a,double b) throws exception1{
        if (a!=0 && b!=0){
            System.out.println("ket qua phep chia : "+a/b);
        }else {
            throw new exception1();
        }
    }
}
