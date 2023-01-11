package Demo2.Controller;

import Demo2.Model.Model.CongNhan;
import Demo2.Model.Service.CongNhanService;

import java.util.Scanner;

public class CongNhanController {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        CongNhanService congNhanService = new CongNhanService();
        int luaChon=0;
        do {
            System.out.println("-------QUẢN LÍ CÔNG NHÂN---------");
            System.out.println("1.Hiển thị danh sách\n" +
                    "2.Thêm công nhân");

            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số!");
            }

            switch (luaChon) {
                case 1:
                    congNhanService.list();
                    break;
                case 2:
                    System.out.println("Nhập mã công nhân");
                    String newId = sc.nextLine();
                    System.out.println("Nhập tên công nhân");
                    String newName = sc.nextLine();
                    System.out.println("Nhập địa chỉ");
                    String newDiaChi = sc.nextLine();

                    CongNhan congNhan1 = new CongNhan(newId,newName,newDiaChi);
                    congNhanService.add(congNhan1);
                    break;
            }
        }while (luaChon!=0);

    }

}
