package Controllor;

import Model.Model.Person.Employee;
import Model.Service.Employee.EmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    public static void EmployeeManagement() {

        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();
        int luaChon1=0;

        do {
            System.out.println("-------Menu-------");
            System.out.println("1.Display list employees(1.Hiển thị danh sách nhân viên)\n" +
                    "2.Add new employee(2.Thêm nhân viên mới)\n" +
                    "3.Delete employee(3.Xóa nhân viên)\n" +
                    "4.Edit employee(4.Sửa nhân viên)\n" +
                    "5.Return main menu(5. Quay lại menu chính)\n");

            try {
                luaChon1 = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số!");
            }


            switch (luaChon1){
                case 1:
                    employeeService.list();
                    break;
                case 2:
                    System.out.println("Nhập mã nhân viên");
                    String newId = sc.nextLine();
//                    ---------------------------------------------------------------------------------
                    System.out.println("Nhập tên nhân viên");
                    String newTen = sc.nextLine();
//                    ----------------------------------------------------------------------------------
                    System.out.println("Nhập ngày sinh");
                    String newNgaySinh = sc.nextLine();
//                    -----------------------------------------------------------------------------------
                    System.out.println("Nhập giới tính");
                    String newGioiTinh = sc.nextLine();
//                    ------------------------------------------------------------------------------------
                    System.out.println("Nhập số CMND");
                    String newCMND =sc.nextLine();
//                    ------------------------------------------------------------------------------------
                    System.out.println("Nhập sô điện thoại");
                    String newSDT = sc.nextLine();
//                   -----------------------------------------------------------------------------------
                    String newTrinhDo="";
                    int choiceTrinhDo=0;
                    do {
                        System.out.println("Nhập trình độ");
                        System.out.println("1.trung cấp\n" +
                                "2.cao đẳng\n" +
                                "3.đại học \n" +
                                "4.sau đại học");

                        try {
                            choiceTrinhDo = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.err.println("Vui lòng nhập số!");
                        }
                        switch (choiceTrinhDo){
                            case 1:
                                newTrinhDo= "Trung cấp";
                                break;
                            case 2:
                                newTrinhDo="Cao đẳng";
                                break;
                            case 3:
                                newTrinhDo="Đại học";
                                break;
                            case 4:
                                newTrinhDo="Sau đại học";
                                break;
                        }
                    }while (choiceTrinhDo!=0);
//                    ---------------------------------------------------------------------------------------
                    String newViTri="";
                    int choiceViTri=0;
                    do {
                        System.out.println("Nhập vị trí");
                        System.out.println("1.lễ tân\n" +
                                "2.phục vụ\n" +
                                "3.chuyên viên\n" +
                                "4.giám sát\n" +
                                "5.quản lý\n" +
                                "6.giám đốc.");
                        try {
                            choiceViTri = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.err.println("Vui lòng nhập số!");
                        }

                        switch (choiceTrinhDo){
                            case 1:
                                newViTri = "Lễ tân";
                                break;
                            case 2:
                                newViTri ="Phục vụ";
                                break;
                            case 3:
                                newViTri = "Chuyên viên";
                                break;
                            case 4:
                                newViTri = "Giám sát";
                                break;
                            case 5:
                                newViTri = "Quản lý";
                                break;
                            case 6:
                                newViTri = "Giám đốc";
                                break;
                        }
                    }while (choiceViTri!=0);
//                    ----------------------------------------------------------------------
                    System.out.println("Nhập lương");
                    String newLuong = sc.nextLine();


                    Employee employee1 = new Employee(newId,newTen,newCMND,newNgaySinh,newGioiTinh,newCMND,newSDT,newTrinhDo,newViTri,newLuong);
                    employeeService.add(employee1);
                    break;

            }
        }while (luaChon1!=5);

    }




}
