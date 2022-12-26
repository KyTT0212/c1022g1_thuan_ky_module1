package ss19_StringAndRegex.BaiTap;

import org.omg.CORBA.MARSHAL;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class className {
    public static final String REGEX_CLASSNAME = "^[C|A|P][0-9]{4}[G|H|I|K|L|M]$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên lớp");
        String myClassNmae= sc.nextLine();

        Pattern p = Pattern.compile(REGEX_CLASSNAME);
        Matcher matcher = p.matcher(myClassNmae);
        System.out.println(matcher.matches());
    }
}
