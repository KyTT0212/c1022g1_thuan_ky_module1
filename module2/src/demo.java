import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("a");
        myList.add("b");
        myList.add("c");

        for (String element :myList) {
            System.out.print(element+"\t");
        }

    }
}
