package ss16_TextFile.BaiTap.CopyFileText;

import java.io.*;
import java.util.Scanner;

public class FileText {
    public static void fileText(String filePath, String writeFilePath) {

        try{
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(writeFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            int sum = 0;

            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.append(line+"\n");
                sum = sum + line.length();
                System.out.println(line);
            }

            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Tổng số kí tự là  "+sum);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (Exception e) {
            System.out.println("File không tồn tại or nội dung lỗi");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập đường dẫn File từ tệp tin nguồn");
        String path = sc.nextLine();
        System.out.println("Nhập đường dẫn File từ tệp tin đích");
        String writePath = sc.nextLine();

        // D:\codegym\module2\src\ss16_TextFile\BaiTap\CopyFileText\sourceFile.csv
        // D:\codegym\module2\src\ss16_TextFile\BaiTap\CopyFileText\targetFile.csv

        fileText(path,writePath);
    }
}
