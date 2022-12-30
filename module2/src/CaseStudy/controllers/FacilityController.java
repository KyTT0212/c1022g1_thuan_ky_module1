package CaseStudy.controllers;

import CaseStudy.Model.Repository.Facility.IFacilityRepo;
import CaseStudy.Model.Service.Facility.FacilityServiceImpl;
import CaseStudy.Model.model.Facility.Room;
import CaseStudy.Model.model.Facility.Villa;

import java.util.Scanner;

public class FacilityController {
    public static void facilityController(){
        Scanner sc = new Scanner(System.in);
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        int menu3;

        do {
                System.out.println("----MENU----");
                System.out.println("1. Display list facility (1. Cơ sở danh sách hiển thị)\n" +
                        "2. Add new facilities (2. Thêm tiện ích mới)\n" +
                        "3. Display list facility maintenance (3. Hiển thị danh sách bảo trì cơ sở)\n" +
                        "4. Return main menu (4. Quay lại menu chính)");

                menu3 = Integer.parseInt(sc.nextLine());
                switch (menu3){
                    case 1:
                        facilityService.displayList();
                        break;
                    case 2:
                        int choice;
                        do {
                            System.out.println("------Vui lòng chọn dịch vụ muốn thêm------");
                            System.out.println("1.Add New Villa (1.Thêm Room mới)\n" +
                                    "2.Add New Room(2.Thêm Villa mới)\n" +
                                    "3.Back to menu(3.Thoát lựa chọn!)\n");

                            choice = Integer.parseInt(sc.nextLine());
                            switch (choice){
                                case 1:
                                    System.out.println("Nhập tên dịch vụ");
                                    String roomServiceName = sc.nextLine();
                                    System.out.println("Nhập diện tích sử dụng");
                                    String roomUsableArea =sc.nextLine();
                                    System.out.println("Nhập chi phí");
                                    String roomPrice = sc.nextLine();
                                    System.out.println("Nhập số lượng người tối đa");
                                    int rooomPeopleMaximum = Integer.parseInt(sc.nextLine());
                                    System.out.println("Nhập kiểu thuê");
                                    String roomRentalType = sc.nextLine();
                                    System.out.println("Nhập dịch vụ miễn phí đi kèm");
                                    String roomAccompaniedServiceFree = sc.nextLine();
                                    System.out.println("Nhập số lần đã sử dụng");
                                    int numberRO = Integer.parseInt(sc.nextLine());

                                    Room addRoom = new Room(roomServiceName,roomUsableArea,roomPrice,rooomPeopleMaximum,roomRentalType,roomAccompaniedServiceFree);
                                    facilityService.add(addRoom,numberRO);
                                    break;

                                case 2:
                                    System.out.println("Nhập tên dịch vụ");
                                    String villaServiceName = sc.nextLine();
                                    System.out.println("Nhập diện tích sử dụng");
                                    String villaUsableArea =sc.nextLine();
                                    System.out.println("Nhập chi phí");
                                    String villaPrice = sc.nextLine();
                                    System.out.println("Nhập số lượng người tối đa");
//                                    System.out.println("enter maximum number of people:");
//                                    String maxNumberPeopleString = input.nextLine();
//                                    while (!FacilityValidation.validateMaxNumberPeople(maxNumberPeopleString)) {
//                                        System.out.println("Invalid! please enter again greater than zero and less than twenty");
//                                        maxNumberPeopleString = input.nextLine();
//                                    }
//                                    int maxNumberPeople = Integer.parseInt(maxNumberPeopleString);
                                    int villaPeopleMaximum = Integer.parseInt(sc.nextLine());
                                    System.out.println("Nhập kiểu thuê");
                                    String villaRentalType = sc.nextLine();
                                    System.out.println("Nhập tiêu chuẩn phòng");
                                    String villaStandard = sc.nextLine();
                                    System.out.println("Nhập diện tích hồ bơi");
                                    String villaSwimmingArea = sc.nextLine();
                                    System.out.println("Nhập số tầng");
                                    int villaNumFloors = Integer.parseInt(sc.nextLine());
                                    System.out.println("Nhập số lần đã sử dụng");
                                    int numberVL = Integer.parseInt(sc.nextLine());

                                    Villa addVilla = new Villa(villaServiceName,villaUsableArea,villaPrice,villaPeopleMaximum,villaRentalType,villaStandard,villaSwimmingArea,villaNumFloors);
                                    facilityService.add(addVilla,numberVL);
                                    break;

                                case 3:
                                    System.out.println("Thoát lựa chọn");
                                    break;
                            }

                        }while (choice!=3);
                    case 3:
                        facilityService.displayListMaintenance();
                        break;
                    case 4:
                        System.out.println("-------Vui lòng nhập lựa chọn!-------");
                }

            }while (menu3!=4);
    }
}
