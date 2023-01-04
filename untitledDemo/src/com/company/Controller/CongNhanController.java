package com.company.Controller;

import com.company.Model.Service.CongNhanService;

import java.util.Scanner;

public class CongNhanController {
    CongNhanService congNhanService = new CongNhanService();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("------QUẢN LÍ CÔNG NHÂN------");
            System.out.println("1.Hiển thị danh sách công nhân có trong file CSV");
            System.out.println("2.Thêm 1 công nhân mới vào file CSV");
            System.out.println("3.Thoát chương trình");

            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon){
                case 1:


                case 2:

            }

        }while (luaChon!=3);
    }
}
