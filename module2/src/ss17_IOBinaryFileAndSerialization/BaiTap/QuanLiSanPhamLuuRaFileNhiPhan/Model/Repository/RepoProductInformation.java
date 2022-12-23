package ss17_IOBinaryFileAndSerialization.BaiTap.QuanLiSanPhamLuuRaFileNhiPhan.Model.Repository;

import ss17_IOBinaryFileAndSerialization.BaiTap.QuanLiSanPhamLuuRaFileNhiPhan.FileIO;
import ss17_IOBinaryFileAndSerialization.BaiTap.QuanLiSanPhamLuuRaFileNhiPhan.Model.ProductInformation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RepoProductInformation implements IRepoProductInformation {

    static List<ProductInformation> productInformationList = new ArrayList<>();

    @Override
    public void add(ProductInformation productInformation) {
        productInformationList.add(productInformation);
        FileIO.listWrite(productInformationList);
    }

    @Override
    public void list() {
        for (int i = 0; i < productInformationList.size(); i++) {
            System.out.println(productInformationList.get(i));
            FileIO.listWrite(productInformationList);
        }
    }

    @Override
    public void search(String name) {
        for (int i = 0; i < productInformationList.size(); i++) {
            if (productInformationList.get(i).getName().contains(name)) {
                System.out.println(productInformationList.get(i));

            }
        }
    }
}
