package CaseStudy.controllers;

import CaseStudy.Model.Service.Customer.CustomerServiceImpl;
import CaseStudy.Model.Service.Employee.EmployeeServiceImpl;
import CaseStudy.Model.Service.Facility.FacilityServiceImpl;
import CaseStudy.Model.model.Person.Customer;;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("-----displayMainMenu------");
            System.out.println("1.Employee Management (1.Quản lý nhân viên)");
            System.out.println("2.Customer Management (2.Quản lý khách hàng)");
            System.out.println("3.Facility Management (3.Quản lý cơ sở)");
            System.out.println("4.Booking Management (4.Quản lý đặt phòng)");
            System.out.println("5.Promotion Management (5.Quản lý khuyến mãi)");
            System.out.println("6.Exit (6.Thoát)");

            menu = Integer.parseInt(sc.nextLine());

            switch (menu) {

                case 1:
                    EmployeeController employeeController = new EmployeeController();
                    employeeController.employeeController();
                    break;

                case 2:
                    CustomerController customerController = new CustomerController();
                    customerController.customerController();
                    break;

                case 3:
                    FacilityController facilityController = new FacilityController();
                    facilityController.facilityController();
                    break;


                default:
                    System.out.println("--------Vui lòng nhập lại lựa chọn----------");
                    break;

            }
//            } else if (luaChon == 4) {
//                System.out.println("----MENU----");
//                System.out.println("1.Add new booking (1.Thêm đặt phòng mới)\n" +
//                        "2.Display list booking (2.Hiển thị danh sách đặt phòng)\n" +
//                        "3.Return main menu (3. Quay lại menu chính)\n");
//            } else if (luaChon == 5) {
//                System.out.println("----MENU----");
//                System.out.println("1. Display list of customers using service (1. Hiển thị danh sách khách hàng sử dụng dịch vụ)\n" +
//                        "2. Display list customers get voucher (2. Hiển thị danh sách khách hàng nhận voucher)\n" +
//                        "3. Return main menu (3. Quay lại menu chính)");
//            } else if (luaChon == 6) {
//                System.out.println("Chương trình kết thúc!");
//            } else {
//                System.out.println("vui long nhap lai ");
//            }

        } while (menu != 6);

    }
}
