package ss17_IOBinaryFileAndSerialization.BaiTap.QuanLiSanPhamLuuRaFileNhiPhan.Controller;

import ss17_IOBinaryFileAndSerialization.BaiTap.QuanLiSanPhamLuuRaFileNhiPhan.Model.ProductInformation;
import ss17_IOBinaryFileAndSerialization.BaiTap.QuanLiSanPhamLuuRaFileNhiPhan.Model.Service.ServiceProductInformation;

import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) {
        ServiceProductInformation serviceProductInformation = new ServiceProductInformation();
            Scanner sc = new Scanner(System.in);
         int luaChon=0;;

             do {
                 System.out.println("-----Quản lí sản phẩm-----");
                 System.out.println("1.Thêm sản phẩm");
                 System.out.println("2.Hiển thị danh sách sản phẩm");
                 System.out.println("3.Tìm kiếm thông tin sản phẩm");
                 System.out.println("0.Kết thúc chương trình");

                 luaChon = Integer.parseInt(sc.nextLine());
                 if (luaChon==1){
                     System.out.println("Nhập id sản phẩm");
                     int newId = Integer.parseInt(sc.nextLine());
                     System.out.println("Nhập tên sản phẩm");
                     String newName = sc.nextLine();
                     System.out.println("Nhâp ngày sản xuất");
                     int newdateOfManufacture = Integer.parseInt(sc.nextLine());
                     System.out.println("Nhập tháng sản xuất");
                     int newmonthOfManufacture = Integer.parseInt(sc.nextLine());
                     System.out.println("Nhập năm sản xuất");
                     int newyearOfManufacture = Integer.parseInt(sc.nextLine());
                     System.out.println("Nhạp giá sản phẩm");
                     double newPrice = Double.parseDouble(sc.nextLine());

                     ProductInformation productInformation1 = new ProductInformation(newId,newName,newdateOfManufacture,newmonthOfManufacture,newyearOfManufacture,newPrice);
                     serviceProductInformation.add(productInformation1);
                 }
                 else if (luaChon==2){
                     serviceProductInformation.list();
                 }
                 else if (luaChon==3){
                     System.out.println("Nhập tên sản phẩm muốn tìm kiếm");
                     String string = sc.nextLine();
                     serviceProductInformation.search(string);
                 }else {
                     System.out.println("Vui lòng nhập lại lựa chọn");
                 }
             }while (luaChon!=0);
         }
    }

