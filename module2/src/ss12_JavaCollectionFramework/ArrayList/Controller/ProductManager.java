package ss12_JavaCollectionFramework.ArrayList.Controller;

import ss12_JavaCollectionFramework.ArrayList.Model.Product;
import ss12_JavaCollectionFramework.ArrayList.Model.Service.Service;

import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);

        int luaChon=0;

        do {
            System.out.println("");
            System.out.println("----------------------------");
            System.out.println("----Chương trình quản lý sản phẩm----");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa thông tin sản phẩm theo id");
            System.out.println("3.Xoá sản phẩm theo id");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7.Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("0.Ket thuc chuong trinh");

            luaChon = Integer.parseInt(sc.nextLine());

            if (luaChon==1){
                System.out.println("Nhap id");
                int newId = Integer.parseInt(sc.nextLine()) ;
                System.out.println("Nhap ten sp");
                String newName = sc.nextLine();
                System.out.println("Nhap gia tien");
                double newPrice = Double.parseDouble(sc.nextLine());
                Product product1 = new Product(newId,newName,newPrice);
                service.add(product1);
               }
            else if (luaChon==2){
                System.out.println("Nhap id can sua");
                int oldId = Integer.parseInt(sc.nextLine());
                Product x = service.findById(oldId);
                if (x!= null){
                    System.out.println("Nhap ten sp");
                    String newName = sc.nextLine();
                    System.out.println("Nhap gia tien");
                    double newPrice = Double.parseDouble(sc.nextLine());
                    x.setName(newName);
                    x.setPrice(newPrice);
                    service.update(x);
                    }else System.out.println("Không tồn tại");
            }
            else if (luaChon==3){
                System.out.println("Nhap id muon xoa");
                int oldId = Integer.parseInt(sc.nextLine());
                Product x = service.findById(oldId);
                if (x!= null){
                    service.remove(x);
                }else System.out.println("Không tồn tại");
            }
            else if (luaChon==4){
                service.list();
            }
            else if (luaChon == 5){
                System.out.println("Nhap ten san pham can tim");
                String searchName = sc.nextLine();
                service.search(searchName);
            }
            else if (luaChon==6){
                service.sortAscendingOrder();
            }
            else if (luaChon==7){
                service.sortDescendingOrder();
            }else if (luaChon==0){

            }else {
                System.out.println("chuong trinh khong ton tai");
            }
        }while (luaChon!=0);


    }
}
