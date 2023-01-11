package bai3.Data;

import bai3.Model.Model.NganHang;
import bai3.Model.Service.INganHangService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static final String PATH = "src\\bai3\\Data\\so_tiet_kiem.csv";

    public static List<NganHang> readNganHangList() {
        List<NganHang> myNganHangList = new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String arr[];
            NganHang nganHang;

            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");

                int soThuTu = Integer.parseInt(arr[0]);
                String maSoTietKiem = arr[1];
                int soTien = Integer.parseInt(arr[2]);
                String kyHan = arr[3];
                int laiSuat = Integer.parseInt(arr[4]);
                String maKhachHang = arr[5];

                nganHang = new NganHang(soThuTu, maSoTietKiem, soTien, kyHan, laiSuat, maKhachHang);
                myNganHangList.add(nganHang);

            }
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found Exception");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return myNganHangList;
    }

//    -----------------------------------------------------------------

    public static void writeNganHangList(List<NganHang> myNganHangList) {
        try {
            FileWriter fileWriter = new FileWriter(PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (NganHang n : myNganHangList) {
                bufferedWriter.write(n.getSoThuTu() + "," + n.getMaSoTietKiem() + "," + n.getSoTien() + "," + n.getKyHan() + "," + n.getLaiSuat() + "," + n.getMaKhachHang());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
