package ss11_DSAStackQueue.DemSoLanXuatHienCuaMoiTuDungMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MyMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi ki tu:");
        String str = sc.nextLine().toLowerCase();

        Map<String,String> myMap = new TreeMap<>();
        for (int i =0 ; i<str.length(); i++){
            if(myMap.containsKey(str.charAt(i)+"")){
                myMap.put(str.charAt(i)+"", myMap.get(str.charAt(i)+"")+1);
            }else {
                myMap.put(str.charAt(i)+"","1");
            }
        }
        System.out.println("so lan xuat hien : ");
        for (Map.Entry<String,String> entry : myMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
