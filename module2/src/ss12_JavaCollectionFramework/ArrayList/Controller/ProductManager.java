package ss12_JavaCollectionFramework.ArrayList.Controller;

import ss12_JavaCollectionFramework.ArrayList.Model.Service.ServiceProductManager;
import ss12_JavaCollectionFramework.ArrayList.Model.model.ModelProduct;

import java.util.Scanner;

public class ProductManager extends ServiceProductManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ModelProduct danhSachSanPham = new ModelProduct();

        int luaChon = sc.nextInt();

        do{
            System.out.println("-----Quản lí sản phẩm-----");
            System.out.println(
                    "1.Thêm sản phẩm\n" +
                            "2.Sửa thông tin sản phẩm theo id\n" +
                            "3.Xoá sản phẩm theo id\n" +
                            "4.Hiển thị danh sách sản phẩm\n" +
                            "5.Tìm kiếm sản phẩm theo tên\n" +
                            "6.Sắp xếp sản phẩm tăng dần\n"+
                            "7.giảm dần theo giá"
            );
            if(luaChon==1){
                System.out.println("Nhap id san pham");
                int id = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap ten san pham");
                String name = sc.nextLine();
                System.out.println("Nhap gia tien cua san pham");
                double price = sc.nextDouble();
                ModelProduct add = new ModelProduct(id, name, price);
                //danhSachSanPham.add();
            }
            else if (luaChon==2){
                System.out.println("Nhap id can sua");
                int idOld;
            }
        }while (luaChon!=0);
    }
}
