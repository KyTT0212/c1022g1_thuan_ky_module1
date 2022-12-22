package ss16_TextFile.BaiTap.DocFile;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class FileText<list> {
    public static final String FILE_PATH="D:\\codegym\\module2\\src\\ss16_TextFile\\BaiTap\\DocFile\\FileSaveList.csv";

    public static List<ListOfCountries> listFile(){
        List<ListOfCountries> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String arr[];

            while ((line = bufferedReader.readLine())!=null){
                arr = line.split(",");
                int id = Integer.parseInt(arr[0]);
                String sign = arr[1];
                String countryName = arr[2];
                ListOfCountries listOfCountries = new ListOfCountries(id, sign, countryName);
                list.add(listOfCountries);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException();
        }
        System.out.println(list);
        return list;
    }


    public static void main(String[] args) {
        List<ListOfCountries> listOfCountries = listFile();
        for (ListOfCountries listOfCountries1 : listOfCountries){
            System.out.println(listOfCountries1);
        }
    }

}
