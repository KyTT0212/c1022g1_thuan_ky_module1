package CaseStudy.controllers;

import CaseStudy.Model.Service.Employee.EmployeeServiceImpl;
import CaseStudy.Model.model.Person.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    public static void employeeController() {
        Scanner sc = new Scanner(System.in);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        int menu1;
        do {
            System.out.println("----MENU----");
            System.out.println("1.Display list employees (1.Hiển thị danh sách nhân viên)");
            System.out.println("2.Add new employee (2.Thêm nhân viên mới)");
            System.out.println("3.Delete employee (3.Xóa nhân viên)");
            System.out.println("4.Edit employee (4.Sửa nhân viên)");
            System.out.println("5.Return main menu (5. Quay lại menu chính)");
            menu1 = Integer.parseInt(sc.nextLine());

            switch (menu1) {
                case 1:
                    employeeService.list();
                    break;
                case 2:
                    System.out.println("Nhập mã nhân viên");
                    int newId = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập họ tên nhân viên");
                    String newName = sc.nextLine();
                    System.out.println("Nhập ngày sinh nhân viên");
                    String newDateOfBirth = sc.nextLine();
                    System.out.println("Nhập giới tính : nam, nữ");
                    String newSex = sc.nextLine();
//                    boolean newSex;
//                    String flag = sc.nextLine();
//                    if (flag == "nam") {
//                        newSex = false;
//                    } else {
//                        newSex = true;
//                    }
                    System.out.println("Nhập số CMND nhân viên");
//                    long newCMND = Integer.parseInt(sc.nextLine());
                    String newCMND = sc.nextLine();
                    System.out.println("Nhập số điện thoại nhân viên");
//                    long numPhone = Integer.parseInt(sc.nextLine());
                    String numPhone = sc.nextLine();
                    System.out.println("Nhập email nhân viên");
                    String newEmail = sc.nextLine();
                    System.out.println("Nhập trình độ của nhân viên");
                    System.out.println("1. Trung cấp\n" +
                            "2. Cao đẳng\n" +
                            "3. Đại học\n" +
                            "4.Sau đại học"
                    );
                    String newLevel = "";
                    int choiceEmployeeLevel = Integer.parseInt(sc.nextLine());
                    switch (choiceEmployeeLevel) {
                        case 1:
                            newLevel = "Trung cấp";
                            break;
                        case 2:
                            newLevel = "Cao đẳng";
                            break;
                        case 3:
                            newLevel = "Đại học";
                            break;
                        case 4:
                            newLevel = "Sau đại học";
                            break;
                    }
                    System.out.println("Nhập vị trí của nhân viên");
                    System.out.println("1. Lễ tân\n" +
                            "2. Phục vụ\n" +
                            "3. Chuyên viên \n" +
                            "4. Giám sát \n" +
                            "5. Quản lí \n" +
                            "6. Giám đốc"
                    );
                    String newPosition = "";
                    int choiceEmployeePosition = Integer.parseInt(sc.nextLine());
                    switch (choiceEmployeePosition) {
                        case 1:
                            newPosition = "Lễ tân ";
                            break;
                        case 2:
                            newPosition = "Phục vụ ";
                            break;
                        case 3:
                            newPosition = "Chuyên viên ";
                            break;
                        case 4:
                            newPosition = "Giám sát";
                            break;
                        case 5:
                            newPosition = "Quản lí";
                            break;
                        case 6:
                            newPosition = "Giám đốc ";
                            break;
                    }
                    System.out.println("Nhập lương nhân viên");
                    double newWage = Double.parseDouble(sc.nextLine());

                    Employee employee1 = new Employee(newId, newName, newDateOfBirth, newSex, newCMND, numPhone, newEmail, newLevel, newPosition, newWage);
                    employeeService.add(employee1);
                    break;
                case 3:
                    System.out.println("Nhập tên nhân viên muốn xóa");
                    String removeName = sc.nextLine();
                    Employee employee = employeeService.findByName(removeName);
                    if (employee !=null){
                        employeeService.delete(employee);
                    }else {
                        System.out.println("Không tồn tại");
                    }
                    break;
                case 4:
//                    System.out.println("Nhập tên nhân viên muốn chỉnh sửa");
//                    String oldName = sc.nextLine();
//                    Employee x = employeeService.findByName(oldName);
                    List<Employee> employeeList = employeeService.findAll();
                    for (int i = 0; i <employeeList.size() ; i++) {
                        System.out.println(employeeList.get(i));
                    }

                    System.out.println("Nhập id muốn sửa");
                    int oldId = Integer.parseInt(sc.nextLine());
                    Employee y = employeeService.findById(oldId);
                    for (int i = 0; i < employeeList.size(); i++) {
                        if (employeeList.get(i).getId() == oldId) {
                            System.out.println(employeeList.get(i));
                        }
                    }

                    if (y != null) {
                        int choiceEdit ;


                        do {
                            System.out.println("-------Chọn thông tin muốn sửa-------");
                            System.out.println("1.Mã nhân viên");
                            System.out.println("2.Họ tên nhân viên");
                            System.out.println("3.Ngày sinh nhân viên");
                            System.out.println("4.giới tính ");
                            System.out.println("5.Số CMND nhân viên");
                            System.out.println("6.Số điện thoại nhân viên");
                            System.out.println("7.Email nhân viên");
                            System.out.println("8.Trình độ nhân viên");
                            System.out.println("9.Vị trí nhân viên");
                            System.out.println("10.Lương nhân viên");
                            System.out.println("11.Thoát chọn");


//                            Employee employee2 = new Employee();
                            choiceEdit = Integer.parseInt(sc.nextLine());


//                            System.out.println(x);
                            switch (choiceEdit) {

                                case 1:
                                    System.out.println("Nhập mã nhân viên");
                                    int newId1 = Integer.parseInt(sc.nextLine());
                                    y.setId(newId1);
                                    break;
                                case 2:
                                    System.out.println("Nhập họ tên nhân viên");
                                    String newName1 = sc.nextLine();
                                    y.setName(newName1);
                                    break;
                                case 3:
                                    System.out.println("Nhập ngày sinh nhân viên");
                                    String newDateOfBirth1 = sc.nextLine();
                                    y.setDateOfBirth(newDateOfBirth1);
                                    break;
                                case 4:
                                    System.out.println("Nhập giới tính : nam,nữ");
//                                    boolean newSex1;
//                                    String flag1 = sc.nextLine();
//                                    if (flag1 == "nam") {
//                                        newSex1 = false;
//                                    } else {
//                                        newSex1 = true;
//                                    }
                                    String newSex1 = sc.nextLine();
                                    y.setSex(newSex1);
                                    break;
                                case 5:
                                    System.out.println("Nhập số CMND nhân viên");
//                                    long newCMND1 = Integer.parseInt(sc.nextLine());
                                    String newCMND1 = sc.nextLine();
                                    y.setNumCMND(newCMND1);
                                    break;
                                case 6:
                                    System.out.println("Nhập số điện thoại nhân viên");
//                                    long numPhone1 = Integer.parseInt(sc.nextLine());
                                    String numPhone1 = sc.nextLine();
                                    y.setNumPhone(numPhone1);
                                    break;
                                case 7:
                                    System.out.println("Nhập email nhân viên");
                                    String newEmail1 = sc.nextLine();
                                    y.setEmail(newEmail1);
                                    break;
                                case 8:
                                    System.out.println("chọn trình độ nhân viên");
                                    System.out.println("1. Trung cấp\n" +
                                            "2. Cao đẳng\n" +
                                            "3. Đại học \n" +
                                            "4. Sau đại học");
                                    String newLevelType = "";
                                    int choice1 = Integer.parseInt(sc.nextLine());
                                    switch (choice1) {
                                        case 1:
                                            newLevelType = "Trung cấp";
                                            break;
                                        case 2:
                                            newLevelType = "Cao đẳng";
                                            break;
                                        case 3:
                                            newLevelType = " Đại học ";
                                            break;
                                        case 4:
                                            newLevelType = "Sau đại học";
                                            break;
                                    }
                                    y.setLevel(newLevelType);
                                    break;
                                case 9:
                                    System.out.println("Chọn vị trí nhân viên");
                                    System.out.println("1. Lễ tân\n" +
                                            "2. Phục vụ\n" +
                                            "3. Chuyên viên \n" +
                                            "4. Giám sát \n" +
                                            "5. Quản lí \n" +
                                            "6. Giám đốc");
                                    String newPositionType = "";
                                    int choice2 = Integer.parseInt(sc.nextLine());
                                    switch (choice2) {
                                        case 1:
                                            newPositionType = "Lễ tân";
                                            break;
                                        case 2:
                                            newPositionType = "Phục vụ";
                                            break;
                                        case 3:
                                            newPositionType = "Chuyên viên ";
                                            break;
                                        case 4:
                                            newPositionType = "Giám sát";
                                            break;
                                        case 5:
                                            newPositionType = "Quản lí";
                                            break;
                                        case 6:
                                            newPositionType = "Giám đốc";
                                            break;
                                    }
                                    y.setLevel(newPositionType);
                                    break;
                                case 10:
                                    System.out.println("Nhập lương nhân viên");
                                    double newWage1 = Double.parseDouble(sc.nextLine());
                                    y.setWage(newWage1);
                                    break;
                                case 11:
                                    System.out.println("Thoát lựa chọn!");
                                    break;
                                default:
                                    System.out.println("--------Nhập sai chức năng vui lòng nhập lại!--------");
                                    break;
                            }

                        } while (choiceEdit != 11);
                        employeeService.edit(y);

                    } else {
                        System.out.println("Thông tin sai hoặc không tồn tại!");
                    }
                default:
                    System.out.println("-----Vui lòng nhập lại lựa chọn-------");
            }

        } while (menu1 != 5);
    }
}


