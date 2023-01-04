package com.company.Model.Repository;

import com.company.Model.Model.CongNhan;

public interface ICongNhanRepo {
    void list();
    void add(CongNhan congNhan);
    String findByName(String name);
    void search(CongNhan congNhan);
}
