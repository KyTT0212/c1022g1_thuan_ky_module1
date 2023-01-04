package com.company.Model.Service;

import com.company.Model.Repository.CongNhanRepo;

public class CongNhanService implements ICongNhanService{
    CongNhanRepo congNhanRepo = new CongNhanRepo();

    @Override
    public void list() {
        congNhanRepo.list();
    }

    @Override
    public void add(String congNhan) {
        congNhanRepo.add(congNhan);
    }

    @Override
    public void findByName(String name) {
        return ;
    }
}
