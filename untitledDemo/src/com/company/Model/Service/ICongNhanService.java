package com.company.Model.Service;

import com.company.Model.Model.CongNhan;

public interface ICongNhanService {
    void list();
    void add(CongNhan congNhan);
    String findByName(String name);

}
