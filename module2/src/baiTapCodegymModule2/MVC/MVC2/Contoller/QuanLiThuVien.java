package baiTapCodegymModule2.MVC.MVC2.Contoller;

import baiTapCodegymModule2.MVC.MVC2.Model.Model.Book;
import baiTapCodegymModule2.MVC.MVC2.Model.Model.ManagementLibrary;
import baiTapCodegymModule2.MVC.MVC2.Model.Service.ServiceManagementLibrary;

import java.util.Scanner;

public class QuanLiThuVien {

    public static void main(String[] args) {
        ServiceManagementLibrary serviceManagementLibrary = new ServiceManagementLibrary();
        Scanner sc = new Scanner(System.in);
        int luaChon=0;
        int luaChon1=0;

        System.out.println("------Thư viện điện tử------");
        System.out.println("1.Quản lí sách");
        System.out.println("2.Quản lí tạp chí");
        System.out.println("3.Quản lí báo");
        System.out.println("");
        System.out.println("VUI LÒNG NHẬP LỰA CHỌN");

        luaChon = Integer.parseInt(sc.nextLine());

        do {
            if (luaChon==1){
                System.out.println("");
                System.out.println("------Chương trình quản lí sách-----");
                System.out.println("1.Thêm sách");
                System.out.println("2.Hiển thị sách");
                System.out.println("3.Tìm kiếm sách");
                System.out.println("4.Thoát chương trình");

                luaChon1=Integer.parseInt(sc.nextLine());

                if (luaChon1==1){
                    System.out.println("Vui lòng nhập mã sách");
                    int newDocumentCode = Integer.parseInt(sc.nextLine());
                    System.out.println("Vui lòng nhập tên nhà xuất bản");
                    String newNameImprint = sc.nextLine();
                    System.out.println("Vui lòng nhập số bản muốn phát hành");
                    int newReleaseNumber = Integer.parseInt(sc.nextLine());
                    System.out.println("Vui lòng nhập tên tác giả");
                    String newName = sc.nextLine();
                    System.out.println("Vui lòng nhập số trang");
                    int newNumberOfPages = Integer.parseInt(sc.nextLine());

                    ManagementLibrary themSach = new Book(newDocumentCode,newNameImprint,newReleaseNumber,newName,newNumberOfPages);
                    serviceManagementLibrary.add((Book) themSach);
                }
                else if (luaChon1 ==2){
                    serviceManagementLibrary.list();
                }
            }



        }while (luaChon!=0);
    }
}
