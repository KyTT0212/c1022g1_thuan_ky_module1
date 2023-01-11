package Demo1.Controllor;

import java.util.Scanner;

public class FuramaControllor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("-------displayMainMenu()------- ");
            System.out.println("1.Employee Management(1.Quản lý nhân viên)\n" +
                    "2.Customer Management(2.Quản lý khách hàng)\n" +
                    "3.Facility Management(3.Quản lý cơ sở)\n" +
                    "4.Booking Management(4.Quản lý đặt phòng)\n" +
                    "5.Promotion Management(5.Quản lý khuyến mãi)\n" +
                    "6.Exit(6. Thoát)");

            luaChon=Integer.parseInt(sc.nextLine());
            switch (luaChon){
                case 1:
                    EmployeeManagement employeeManagement = new EmployeeManagement();
                    employeeManagement.EmployeeManagement();
            }
        }while (luaChon!=6);
    }
}
