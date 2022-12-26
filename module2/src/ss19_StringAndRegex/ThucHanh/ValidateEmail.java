package ss19_StringAndRegex.ThucHanh;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

    public static final String REGES_EMAIL = "^[a-zA-Z][a-zA-Z0-9]*@[A-Za-z](\\.[a-zA-Z]){1,}$";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.println("Nhập email");
            String email = sc.nextLine();
            Pattern p = Pattern.compile(REGES_EMAIL);
            Matcher matcher = p.matcher(email);
            System.out.println(matcher.matches());
        }

    }

}
