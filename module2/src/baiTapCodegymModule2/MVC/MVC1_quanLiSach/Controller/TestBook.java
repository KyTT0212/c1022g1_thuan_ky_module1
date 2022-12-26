package baiTapCodegymModule2.MVC.MVC1_quanLiSach.Controller;

//1.hiển thị danh sách hiện có
//2.hiển thị thoonvg tin chi tiết cuốn sách theo yêu cầu người dùng
//3.cập nhập thông tin cuốn sách
//4.xóa 1 cuốn sách
//5.thêm 1 cuốn sách

import baiTapCodegymModule2.MVC.MVC1_quanLiSach.Molel.Book;
import baiTapCodegymModule2.MVC.MVC1_quanLiSach.Molel.Service.ServiceBook;

import java.util.Scanner;

public class TestBook {

    public static void main(String[] args) {
        ServiceBook serviceBook = new ServiceBook();
        Scanner sc = new Scanner(System.in);
        int luaChon=0;

        do {
            System.out.println("");
            System.out.println("----Chương trình quản lí sách điện tử-----");
            System.out.println("1.hiển thị danh sách hiện có\n" +
                    "2.hiển thị thông tin chi tiết cuốn sách theo yêu cầu người dùng\n" +
                    "3.cập nhập thông tin cuốn sách\n" +
                    "4.xóa 1 cuốn sách\n" +
                    "5.thêm 1 cuốn sách\n" +
                    "0.Kết thúc chương trình");
            System.out.println("--------------------");


            luaChon = Integer.parseInt(sc.nextLine());

            if (luaChon==1){
                serviceBook.list();
            }
            else if (luaChon==2){
                System.out.println("Nhập tên cuốn sách muốn tìm");
                String newName = sc.nextLine();
                Book x = serviceBook.findByName(newName);
//                if (x=){
//                    serviceBook.list(x);
//                }else {
//                    System.out.println("Cuốn sách bạn tìm không tồn tại");
//                }

            }
            else if (luaChon==3){
                System.out.println("Nhập tên cuốn sách muốn cập nhập");
                String newName = sc.nextLine();


            }
        }while (luaChon!=0);
    }
}
