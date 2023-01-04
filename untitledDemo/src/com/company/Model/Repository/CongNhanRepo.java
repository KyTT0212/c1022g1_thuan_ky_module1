package com.company.Model.Repository;

import com.company.Model.Model.CongNhan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CongNhanRepo implements ICongNhanRepo{
    Scanner sc = new Scanner(System.in);
    static List<CongNhan> myList = new ArrayList<>();

    @Override
    public void list() {
        for (int i = 0; i <myList.size() ; i++) {
            System.out.println(myList.get(i));
        }
    }

    @Override
    public void add(CongNhan congNhan) {
        System.out.println("Nhập mã công nhân");
        String newId = sc.nextLine();
        System.out.println("Nhập tên công nhân");
        String newName = sc.nextLine();
        System.out.println("Nhập email");
        String newEmail = sc.nextLine();
        System.out.println("Nhập địa chỉ");
        String newDiaChi = sc.nextLine();

        congNhan = new CongNhan(newId,newName,newEmail,newDiaChi);
        myList.add(congNhan);

    }

    @Override
    public String findByName(String name) {
       if (name == findByName())
        return null;
    }

    @Override
    public void search(CongNhan congNhan) {

        }
    }


}
