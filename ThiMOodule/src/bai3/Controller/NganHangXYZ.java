package bai3.Controller;

import bai3.Model.Model.NganHang;
import bai3.Model.Service.NganHangService;

import java.util.Scanner;

public class NganHangXYZ {
    public static void main(String[] args) {
        NganHangService nganHangService = new NganHangService();
        Scanner sc = new Scanner(System.in);
        int luaChon = 3;
        do {
            System.out.println("-------Nhập lựa chọn--------");
            System.out.println("1.Hiển thị danh sách sổ tiết kiệm");
            System.out.println("2.Đăng ký sổ tiết kiệm");
            System.out.println("3.Thoát Lựa chọn");

            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Number Format Exception");
            }

            switch (luaChon) {
                case 1:
                    nganHangService.list();
                    break;
                case 2:
                    System.out.println("Nhập số thứ tự");
                    int newSoThuTu = Integer.parseInt(sc.nextLine());

                    System.out.println("Nhập mã sổ tiết kiệm");
                    String newMaSoTietKiem = sc.nextLine();

                    System.out.println("Số tiền");
                    int newSoTien = Integer.parseInt(sc.nextLine());

                    System.out.println("Kỳ hạn");
                    int choiceKyHan ;
                    String newKyHan = sc.nextLine();
                    do {
                        System.out.println("-----Lụa chọn kỳ hạn------");
                        System.out.println("1.Vô thời hạn\n" +
                                "2.1 tháng\n" +
                                "3.3 tháng\n" +
                                "4.6 tháng\n" +
                                "5.1 năm");
                        choiceKyHan = Integer.parseInt(sc.nextLine());

                        switch (choiceKyHan){
                            case 1:
                                newKyHan = "Vô thời hạn";
                                break;
                            case 2:
                                newKyHan = "1 tháng";
                                break;
                            case 3:
                                newKyHan = "3 tháng";
                                break;
                            case 4:
                                newKyHan = "6 tháng";
                                break;
                            case 5:
                                newKyHan = "1 năm";
                                break;
                            default:
                                System.err.println("Lựa chọn không tồn tại");

                        }
                    }while (choiceKyHan==0);

                    System.out.println("Lãi suất");
                    int newLaiSuat = Integer.parseInt(sc.nextLine());

                    System.out.println("Mã khách hàng");
                    String newMaKhachHang = sc.nextLine();

                    NganHang nganHang1 = new NganHang(newSoThuTu,newMaSoTietKiem,newSoTien,newKyHan,newLaiSuat,newMaKhachHang);
                    nganHangService.add(nganHang1);
                    break;

                case 3:
                    System.err.println("Thoát chương trình");
                    break;
            }

        } while (luaChon != 3);
    }
}
