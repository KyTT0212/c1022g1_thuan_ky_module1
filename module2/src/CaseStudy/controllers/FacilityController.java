package CaseStudy.controllers;

import CaseStudy.Model.Service.Facility.FacilityServiceImpl;
import CaseStudy.Model.model.Facility.Room;
import CaseStudy.Model.model.Facility.Villa;
import CaseStudy.Data.RegexExpression;

import java.util.Scanner;

public class FacilityController {
    public static void facilityController(){
        Scanner sc = new Scanner(System.in);
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        int menu3 = 0;

        do {
                System.out.println("----MENU----");
                System.out.println("1. Display list facility (1. Cơ sở danh sách hiển thị)\n" +
                        "2. Add new facilities (2. Thêm tiện ích mới)\n" +
                        "3. Display list facility maintenance (3. Hiển thị danh sách bảo trì cơ sở)\n" +
                        "4. Return main menu (4. Quay lại menu chính)");

                try {
                    menu3 = Integer.parseInt(sc.nextLine());
                }catch (NumberFormatException e ){
                    e.printStackTrace();
                }

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
                                    String roomServiceName;
                                    do {
                                        System.out.println("Nhập tên dịch vụ");
                                        roomServiceName = sc.nextLine();
                                    }while (roomServiceName.matches(RegexExpression.REGEX_SERVICEROOM));


                                    String roomUsableArea;
                                    do {
                                        System.out.println("Nhập diện tích sử dụng");
                                        roomUsableArea =sc.nextLine();
                                    }while (roomUsableArea.matches(RegexExpression.REGES_USABLEAREA));


                                    String roomPrice;
                                    do {
                                        System.out.println("Nhập chi phí");
                                        roomPrice = sc.nextLine();
                                    }while (roomPrice.matches(RegexExpression.REGES_PRICE));


                                    String rooomPeopleMaximum;
                                    do {
                                        System.out.println("Nhập số lượng người tối đa");
                                        rooomPeopleMaximum = sc.nextLine();
                                    }while (roomPrice.matches(RegexExpression.REGES_PEOPLEMAXIMUM));


                                    String roomRentalType;
                                    do {
                                        System.out.println("Nhập kiểu thuê");
                                        roomRentalType = sc.nextLine();
                                    }while (roomRentalType.matches(RegexExpression.REGEX_RENTALTYPE));


                                    String roomAccompaniedServiceFree;
                                    do {
                                        System.out.println("Nhập dịch vụ miễn phí đi kèm");
                                        roomAccompaniedServiceFree = sc.nextLine();
                                    }while (roomAccompaniedServiceFree.matches(RegexExpression.REGEX_SERVICENAME));


                                    System.out.println("Nhập số lần đã sử dụng");
                                    int numberRO = Integer.parseInt(sc.nextLine());

                                    Room addRoom = new Room(roomServiceName,roomUsableArea,roomPrice,rooomPeopleMaximum,roomRentalType,roomAccompaniedServiceFree);
                                    facilityService.add(addRoom,numberRO);
                                    break;

                                case 2:
                                    String villaServiceName;
                                    do {
                                        System.out.println("Nhập tên dịch vụ");
                                        villaServiceName = sc.nextLine();
                                    }while (villaServiceName.matches(RegexExpression.REGEX_SERVICEVILLA));


                                    String villaUsableArea;
                                    do {
                                        System.out.println("Nhập diện tích sử dụng");
                                        villaUsableArea =sc.nextLine();
                                    }while (villaUsableArea.matches(RegexExpression.REGES_USABLEAREA));


                                    String villaPrice;
                                    do {
                                        System.out.println("Nhập chi phí");
                                        villaPrice = sc.nextLine();
                                    }while (villaPrice.matches(RegexExpression.REGES_PRICE));


                                    String villaPeopleMaximum;
                                    do {
                                        System.out.println("Nhập số lượng người tối đa");
                                        villaPeopleMaximum = sc.nextLine();
                                    }while (villaPeopleMaximum.matches(RegexExpression.REGES_PEOPLEMAXIMUM));


                                    String villaRentalType;
                                    do {
                                        System.out.println("Nhập kiểu thuê");
                                        villaRentalType = sc.nextLine();
                                    }while (villaRentalType.matches(RegexExpression.REGEX_RENTALTYPE));


                                    String villaStandard;
                                    do {
                                        System.out.println("Nhập tiêu chuẩn phòng");
                                        villaStandard = sc.nextLine();
                                    }while (villaStandard.matches(RegexExpression.REGEX_STANDARD));


                                    String villaSwimmingArea;
                                    do {
                                        System.out.println("Nhập diện tích hồ bơi");
                                        villaSwimmingArea = sc.nextLine();
                                    }while (villaSwimmingArea.matches(RegexExpression.REGES_SWIMMINGAREA));


                                    String villaNumFloors;
                                    do {
                                        System.out.println("Nhập số tầng");
                                        villaNumFloors = sc.nextLine();
                                    }while (villaNumFloors.matches(RegexExpression.REGEX_NUMFLOORS));

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
