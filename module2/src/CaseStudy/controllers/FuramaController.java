package CaseStudy.controllers;

import CaseStudy.Model.Service.Customer.CustomerServiceImpl;
import CaseStudy.Model.Service.Employee.EmployeeServiceImpl;;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int luaChon = 6;

        System.out.println("-----displayMainMenu------");
        System.out.println("1.Employee Management (1.Quản lý nhân viên)");
        System.out.println("2.Customer Management (2.Quản lý khách hàng)");
        System.out.println("3.Facility Management (3.Quản lý cơ sở)");
        System.out.println("4.Booking Management (4.Quản lý đặt phòng)");
        System.out.println("5.Promotion Management (5.Quản lý khuyến mãi)");
        System.out.println("6.Exit (6.Thoát)");
        do {
            luaChon = Integer.parseInt(sc.nextLine());

            if (luaChon == 1) {
                EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
                int luaChon1 = 6;
                do {

                    System.out.println("----MENU----");
                    System.out.println("1.Display list employees (1.Hiển thị danh sách nhân viên)");
                    System.out.println("2.Add new employee (2.Thêm nhân viên mới)");
                    System.out.println("3.Delete employee (3.Xóa nhân viên)");
                    System.out.println("4.Edit employee (4.Sửa nhân viên)");
                    System.out.println("5.Return main menu (5. Quay lại menu chính)");


                    luaChon1 = Integer.parseInt(sc.nextLine());

                    if (luaChon1 == 1) {
                        //           employeeService.list();
                    }
                } while (luaChon != 6);
            } else if (luaChon == 2) {
                CustomerServiceImpl customerService = new CustomerServiceImpl();
                int luaChon2 = 5;
                do {
                    System.out.println("----MENU----");
                    System.out.println("1.Display list customers (1.Hiển thị danh sách khách hàng)\n" +
                            "2.Add new customer (2.Thêm khách hàng mới)\n" +
                            "3.Edit customer (3.Chỉnh sửa khách hàng)\n" +
                            "4.Return main menu (4.Trở lại menu chính)");

                    luaChon2 = Integer.parseInt(sc.nextLine());

                    if (luaChon2 == 1) {
                        customerService.list();
                    } else if (luaChon2 == 2) {
                        System.out.println("Nhập mã khách hàng");
                        int newId = Integer.parseInt(sc.nextLine());
                        System.out.println("Nhập họ tên khách khàng");
                        String newName = sc.nextLine();
                        System.out.println("Nhập ngày sinh khách hàng");
                        int newDateOfBirth = Integer.parseInt(sc.nextLine());
                        System.out.println("Nhập giới tính : nam, nữ");
                        boolean newSex;
                        String flag = sc.nextLine();
                        if (flag == "nam") {
                            newSex = false;
                        } else {
                            newSex = true;
                        }
                        System.out.println(newSex);
                    }

                } while (luaChon2 != 5);
            } else if (luaChon == 3) {
                System.out.println("----MENU----");
                System.out.println("1. Display list facility (1. Cơ sở danh sách hiển thị)\n" +
                        "2. Add new facilities (2. Thêm tiện ích mới)\n" +
                        "3. Display list facility maintenance (3. Hiển thị danh sách bảo trì cơ sở)\n" +
                        "4. Return main menu (4. Quay lại menu chính)");
            } else if (luaChon == 4) {
                System.out.println("----MENU----");
                System.out.println("1.Add new booking (1.Thêm đặt phòng mới)\n" +
                        "2.Display list booking (2.Hiển thị danh sách đặt phòng)\n" +
                        "3.Return main menu (3. Quay lại menu chính)\n");
            } else if (luaChon == 5) {
                System.out.println("----MENU----");
                System.out.println("1. Display list of customers using service (1. Hiển thị danh sách khách hàng sử dụng dịch vụ)\n" +
                        "2. Display list customers get voucher (2. Hiển thị danh sách khách hàng nhận voucher)\n" +
                        "3. Return main menu (3. Quay lại menu chính)");
            } else if (luaChon == 6) {

            } else {
                System.out.println("vui long nhap lai ");
            }

        } while (luaChon != 6);

    }
}
