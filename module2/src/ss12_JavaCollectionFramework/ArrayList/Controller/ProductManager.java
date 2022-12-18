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

            }
            else if (luaChon==2){
                System.out.println("Nhap id can sua");
                int idOld = Integer.parseInt(sc.nextLine());
                ModelProduct p = ServiceProductManager.findProducById(idOld);
                if (p != null){
                    System.out.println("Nhap id moi");
                    int newId = Integer.parseInt(sc.nextLine());
                    p.setId(newId);
                    System.out.println("Nhap ten sp");
                    String newNameProduct = sc.nextLine();
                    p.setNameProduct(newNameProduct);
                    System.out.println("Nhap gia tien");
                    double newPrice = Double.parseDouble(sc.nextLine());
                    p.setPrice(newPrice);
                    ServiceProductManager.updateProduct(p);
                }else {
                    System.out.println("gia tri khong ton tai");
                }
            }
            else if (luaChon==3){
                System.out.println("Nhap id san pham can xoa");
                int id = Integer.parseInt(sc.nextLine());
                ServiceProductManager.removeProduct(id);
            }
            else if (luaChon==4){
                ServiceProductManager.listProduct();
            }
            else if (luaChon==5){
                System.out.println("Nhap ten sp tim kiem");
                Object nameProduct= sc.nextLine();
                ServiceProductManager.seatchProduct(nameProduct);
            }
            else if (luaChon==6){
                ServiceProductManager.sortAscendingOrder();
            }
            else if (luaChon==7){
                ServiceProductManager.sortDescendingOrder();
            }
        }while (luaChon!=0);
    }
}
