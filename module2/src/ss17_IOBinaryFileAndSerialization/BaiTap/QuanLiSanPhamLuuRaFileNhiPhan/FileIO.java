package ss17_IOBinaryFileAndSerialization.BaiTap.QuanLiSanPhamLuuRaFileNhiPhan;

import ss17_IOBinaryFileAndSerialization.BaiTap.QuanLiSanPhamLuuRaFileNhiPhan.Model.ProductInformation;

import java.io.*;
import java.util.List;

public class FileIO {
    public static final String FILE_PATH="D:\\codegym\\module2\\src\\ss17_IOBinaryFileAndSerialization\\BaiTap\\QuanLiSanPhamLuuRaFileNhiPhan\\ ProductInformation.dat";
    public static void listRead (){
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<ProductInformation> list= (List<ProductInformation>) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
    public static void listWrite(List<ProductInformation> list){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
