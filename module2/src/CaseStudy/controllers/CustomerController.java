package CaseStudy.controllers;

import CaseStudy.Model.Service.Customer.CustomerServiceImpl;
import CaseStudy.Model.model.Person.Customer;
import sun.font.DelegatingShape;

import java.util.List;
import java.util.Scanner;

public class CustomerController {
    public static void customerController() {
        Scanner sc = new Scanner(System.in);
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        int menu2 = 0;
        do {
            System.out.println("----MENU----");
            System.out.println("1.Display list customers (1.Hiển thị danh sách khách hàng)\n" +
                    "2.Add new customer (2.Thêm khách hàng mới)\n" +
                    "3.Edit customer (3.Chỉnh sửa khách hàng)\n" +
                    "4.Return main menu (4.Trở lại menu chính)");
            try {
                menu2 = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e ){
                e.printStackTrace();
            }


            switch (menu2) {
                case 1:
                    customerService.list();
                    break;
                case 2:
                    System.out.println("Nhập mã khách hàng");
                    String newId = sc.nextLine();
                    System.out.println("Nhập họ tên khách khàng");
                    String newName = sc.nextLine();
                    System.out.println("Nhập ngày sinh khách hàng");
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
                    System.out.println("Nhập số CMND khách hàng");
//                    long newCMND = Integer.parseInt(sc.nextLine());
                    String newCMND = sc.nextLine();
                    System.out.println("Nhập số điện thoại khách hàng");
//                    long numPhone = Integer.parseInt(sc.nextLine());
                    String numPhone = sc.nextLine();
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
//                    System.out.println("Nhập tên khách hàng muốn chỉnh sửa");
//                    String oldName = sc.nextLine();
//                    Customer x = customerService.findByName(oldName);
//                    List<Customer> customerList = customerService.findAll();
//                    int count = 0;
//                    for (int i = 0; i < customerList.size(); i++) {
//                        if (customerList.get(i).getName().equals(oldName)) {
//                            System.out.println(customerList.get(i));
//                            count++;
//                        }
//                    }
//
//
//                    if (x != null) {
//                        if (count > 1) {
//
//                            System.out.println("Chọn id muốn sửa");
//                        int oldId= Integer.parseInt(sc.nextLine());
//
//                            for (int i = 0; i < customerList.size(); i++) {
//                                if (oldId == customerList.get(i).getId()) {
//                                    System.out.println(customerList.get(i));
//                                    break;
//                                }
//                            }
//
//                        }
//
////                        }

//                    c2
                    List<Customer> customerList = customerService.findAll();
                    for (int i = 0; i <customerList.size() ; i++) {
                        System.out.println(customerList.get(i));
                    }

                    System.out.println("Nhập id muốn sửa");
                    String oldId = sc.nextLine();
                    Customer y = customerService.findById(oldId);
                    for (int i = 0; i < customerList.size(); i++) {
                        if (customerList.get(i).getId() == oldId) {
                            System.out.println(customerList.get(i));
                        }
                    }

                    if (y!=null){

                    int choiceEdit;
//                        Customer customer2 = new Customer();

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

                            choiceEdit = Integer.parseInt(sc.nextLine());

                            switch (choiceEdit) {

                                case 1:
                                    System.out.println("Nhập mã khách hàng");
                                    String newId1 = sc.nextLine();
                                    y.setId(newId1);
                                    break;
                                case 2:
                                    System.out.println("Nhập họ tên khách khàng");
                                    String newName1 = sc.nextLine();
                                    y.setName(newName1);
                                    break;
                                case 3:
                                    System.out.println("Nhập ngày sinh khách hàng");
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
                                    System.out.println("Nhập số CMND khách hàng");
//                                    long newCMND1 = Integer.parseInt(sc.nextLine());
                                    String newCMND1 = sc.nextLine();
                                    y.setNumCMND(newCMND1);
                                    break;
                                case 6:
                                    System.out.println("Nhập số điện thoại khách hàng");
//                                    long numPhone1 = Integer.parseInt(sc.nextLine());
                                    String numPhone1 = sc.nextLine();
                                    y.setNumPhone(numPhone1);
                                    break;
                                case 7:
                                    System.out.println("Nhập email khách hàng");
                                    String newEmail1 = sc.nextLine();
                                    y.setEmail(newEmail1);
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
                                    y.setCustomerType(newCustomerType1);
                                    break;
                                case 9:
                                    System.out.println("Nhập địa chỉ khách hàng");
                                    String newAddress1 = sc.nextLine();
                                    y.setAddress(newAddress1);
                                    break;
                                case 10:
                                    System.out.println("Thoát chương trình!");
                                    break;
                                default:
                                    System.out.println("-------Nhập sai chức năng vui lòng nhập lại!--------");
                                    break;
                            }


                        } while (choiceEdit != 10);

                         customerService.edit(y);



            } else{
                System.out.println("Thông tin sai hoặc không tồn tại!");
            }
            default:
                System.out.println("-------Vui lòng nhập lại lựa chọn---------");

        }

    } while(menu2 !=4);
}
}
