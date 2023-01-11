package Demo2.ReaderWriteFile;

import Demo2.Model.Model.CongNhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ReaderWriteCongNhan {
    public static final String PATH = "src\\Demo2\\ReaderWriteFile\\CongNhan.csv";

    public static List<CongNhan> readFileCongNhan() {
        List<CongNhan> myListCongNhan = new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String arr[];
            CongNhan congNhan;

            while ((line = bufferedReader.readLine())!=null){
                arr = line.split(",");

                String id = arr[0];
                String ten = arr[1];
                String diaChi = arr[2];

                congNhan = new CongNhan(id,ten,diaChi);
                myListCongNhan.add(congNhan);
            }

        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return myListCongNhan;
    }
//    ---------------------------------------------------------------------------

    public static void writeCongNhan(List<CongNhan> congNhanListWrite){
        try {
            FileWriter fileWriter = new FileWriter(PATH,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (CongNhan c : congNhanListWrite){
                bufferedWriter.write(c.getId()+","+c.getTen()+","+c.getDiaChi());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
