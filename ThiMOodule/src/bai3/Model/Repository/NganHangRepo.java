package bai3.Model.Repository;

import bai3.Data.ReadWriteFile;
import bai3.Model.Model.NganHang;

import java.util.ArrayList;
import java.util.List;

public class NganHangRepo implements INganHangRepo {
    public static List<NganHang> myNganHangList = new ArrayList<>();
    @Override
    public void list() {
        for (int i = 0; i <myNganHangList.size() ; i++) {
            System.out.println(myNganHangList.get(i));
        }myNganHangList = ReadWriteFile.readNganHangList();
    }

    @Override
    public void add(NganHang nganHang) {
        myNganHangList.add(nganHang);
        ReadWriteFile.writeNganHangList(myNganHangList);
    }
}
