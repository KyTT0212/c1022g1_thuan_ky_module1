public class Test {

    String solution(String arg1) {
        String str = "";
        for (int i = 0; i <arg1.length() -1; i++) {
            str = str+arg1.charAt(i)+"";
            String str1=arg1.charAt(i+1)+"";
            if(str1==str1.toUpperCase()){
                str = str+"";
            }
        }

        return str.toLowerCase()+arg1.charAt(arg1.length()-1);
    }
}
