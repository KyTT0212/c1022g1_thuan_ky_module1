package ss15_ExceptionAndDebug;


public class IllegalTriangleExceptionCheck {
    public static void IllegalTriangleExceptionCheck(int a, int b, int c) throws IllegalTriangleException {
        if (a>0 && b>0 && c>0 && a+b<c && a+c<b && b+c<a){
            System.out.println("3 canh vua nhap la canh cua tam giac : ");
        }
        else {
            throw new IllegalTriangleException("Number Format Exception");
        }
    }


}
