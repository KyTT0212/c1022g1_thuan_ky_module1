package ss17_IOBinaryFileAndSerialization.BaiTap.QuanLiSanPhamLuuRaFileNhiPhan.Model.Service;

import ss17_IOBinaryFileAndSerialization.BaiTap.QuanLiSanPhamLuuRaFileNhiPhan.Model.ProductInformation;
import ss17_IOBinaryFileAndSerialization.BaiTap.QuanLiSanPhamLuuRaFileNhiPhan.Model.Repository.RepoProductInformation;

public class ServiceProductInformation implements IServiceProductInformation {
    RepoProductInformation repoProductInformation = new RepoProductInformation();


    @Override
    public void add(ProductInformation productInformation) {
        repoProductInformation.add(productInformation);
    }

    @Override
    public void list() {
        repoProductInformation.list();
    }

    @Override
    public void search(String name) {
        repoProductInformation.search(name);
    }
}
