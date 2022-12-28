package CaseStudy.controllers;

import CaseStudy.Model.Service.Customer.CustomerServiceImpl;
import CaseStudy.Model.model.Person.Customer;

import java.util.Scanner;

public class CustomerController {
    public static Customer customerController() {
        Scanner sc = new Scanner(System.in);
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        int menu2;
        do {
            System.out.println("----MENU----");
            System.out.println("1.Display list customers (1.Hiển thị danh sách khách hàng)\n" +
                    "2.Add new customer (2.Thêm khách hàng mới)\n" +
                    "3.Edit customer (3.Chỉnh sửa khách hàng)\n" +
                    "4.Return main menu (4.Trở lại menu chính)");
            menu2 = Integer.parseInt(sc.nextLine());

            switch (menu2) {
                case 1:
                    customerService.list();
                    break;
                case 2:
                    System.out.println("Nhập mã khách hàng");
                    int newId = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập họ tên khách khàng");
                    String newName = sc.nextLine();
                    System.out.println("Nhập ngày sinh khách hàng");
                    String newDateOfBirth = sc.nextLine();
                    System.out.println("Nhập giới tính : nam, nữ");
                    boolean newSex;
                    String flag = sc.nextLine();
                    if (flag == "nam") {
                        newSex = false;
                    } else {
                        newSex = true;
                    }
                    System.out.println("Nhập số CMND khách hàng");
                    long newCMND = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập số điện thoại khách hàng");
                    long numPhone = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập email khách hàng");
                    String newEmail = sc.nextLine();
                    System.out.println("Nhập lever khách hàng");
                    System.out.println("1. Diamond\n" +
                            "2. Platinium\n" +
                            "3. Gold\n" +
                            "4.Silver\n" +
                            "5. Member");
                    String newCustomerType = "";
                    int choiceCustomer = Integer.parseInt(sc.nextLine());
                    switch (choiceCustomer) {
                        case 1:
                            newCustomerType = "Diamond";
                            break;
                        case 2:
                            newCustomerType = "Platinium";
                            break;
                        case 3:
                            newCustomerType = "Gold";
                            break;
                        case 4:
                            newCustomerType = "Silver";
                            break;
                        case 5:
                            newCustomerType = "Member";
                            break;
                    }
                    System.out.println("Nhập địa chỉ khách hàng");
                    String newAddress = sc.nextLine();
                    Customer customer1 = new Customer(newId, newName, newDateOfBirth, newSex, newCMND, numPhone, newEmail, newCustomerType, newAddress);
                    customerService.add(customer1);
                    break;
                case 3:
                    System.out.println("Nhập tên khách hàng muốn chỉnh sửa");
                    String oldName = sc.nextLine();
                    Customer x = customerService.findByName(oldName);
                    if (x != null) {
                    int choiceEdit = 10;


                    do {
                        System.out.println("-------Chọn thông tin muốn sửa-------");
                        System.out.println("1.Mã khách hàng");
                        System.out.println("2.Họ tên khách khàng");
                        System.out.println("3.Ngày sinh khách hàng");
                        System.out.println("4.giới tính ");
                        System.out.println("5.Số CMND khách hàng");
                        System.out.println("6.Số điện thoại khách hàng");
                        System.out.println("7.Email khách hàng");
                        System.out.println("8.Lever khách hàng");
                        System.out.println("9.Địa chỉ khách hàng");
                        System.out.println("10.Thoát chọn");


                        Customer customer2 = new Customer();
                        choiceEdit = Integer.parseInt(sc.nextLine());



//                            System.out.println(x);
                            switch (choiceEdit) {

                                case 1:
                                    System.out.println("Nhập mã khách hàng");
                                    int newId1 = Integer.parseInt(sc.nextLine());
                                    customer2.setId(newId1);
                                    break;
                                case 2:
                                    System.out.println("Nhập họ tên khách khàng");
                                    String newName1 = sc.nextLine();
                                    customer2.setName(newName1);
                                    break;
                                case 3:
                                    System.out.println("Nhập ngày sinh khách hàng");
                                    String newDateOfBirth1 = sc.nextLine();
                                    customer2.setDateOfBirth(newDateOfBirth1);
                                    break;
                                case 4:
                                    System.out.println("Nhập giới tính : nam,nữ");
                                    boolean newSex1;
                                    String flag1 = sc.nextLine();
                                    if (flag1 == "nam") {
                                        newSex1 = false;
                                    } else {
                                        newSex1 = true;
                                    }
                                    customer2.setSex(newSex1);
                                    break;
                                case 5:
                                    System.out.println("Nhập số CMND khách hàng");
                                    long newCMND1 = Integer.parseInt(sc.nextLine());
                                    customer2.setNumCMND(newCMND1);
                                    break;
                                case 6:
                                    System.out.println("Nhập số điện thoại khách hàng");
                                    long numPhone1 = Integer.parseInt(sc.nextLine());
                                    customer2.setNumPhone(numPhone1);
                                    break;
                                case 7:
                                    System.out.println("Nhập email khách hàng");
                                    String newEmail1 = sc.nextLine();
                                    customer2.setEmail(newEmail1);
                                    break;
                                case 8:
                                    System.out.println("chọn lever khách hàng");
                                    System.out.println("1. Diamond\n" +
                                            "2. Platinium\n" +
                                            "3. Gold\n" +
                                            "4.Silver\n" +
                                            "5. Member");
                                    String newCustomerType1 = "";
                                    int choice1 = Integer.parseInt(sc.nextLine());
                                    switch (choice1) {
                                        case 1:
                                            newCustomerType1 = "Diamond";
                                            break;
                                        case 2:
                                            newCustomerType1 = "Platinium";
                                            break;
                                        case 3:
                                            newCustomerType1 = "Gold";
                                            break;
                                        case 4:
                                            newCustomerType1 = "Silver";
                                            break;
                                        case 5:
                                            newCustomerType1 = "Member";
                                            break;


                                    }
                                    customer2.setCustomerType(newCustomerType1);
                                    break;
                                case 9:
                                    System.out.println("Nhập địa chỉ khách hàng");
                                    String newAddress1 = sc.nextLine();
                                    customer2.setAddress(newAddress1);
                                    break;
                                case 10:
                                    System.out.println("Thoát lựa chọn!");
                                default:
                                    System.out.println("Nhập sai chức năng");
                            }

                        }while (choiceEdit != 10) ;



                    }else {
                        System.out.println("Thông tin sai hoặc không tồn tại!");
                    }
                default:
                    System.out.println("Vui lòng nhập lại lựa chọn");
            }

        }while (menu2 != 4) ;
        return null;
    }
}
