package bai3.Model.Service;

import bai3.Model.Model.NganHang;
import bai3.Model.Repository.NganHangRepo;

public class NganHangService implements INganHangService{
    NganHangRepo nganHangRepo = new NganHangRepo();

    @Override
    public void list() {
        nganHangRepo.list();
    }

    @Override
    public void add(NganHang nganHang) {
        nganHangRepo.add(nganHang);
    }
}
