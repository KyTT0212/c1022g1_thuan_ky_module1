package ss17_IOBinaryFileAndSerialization.BaiTap.QuanLiSanPhamLuuRaFileNhiPhan.Model.Repository;

import ss17_IOBinaryFileAndSerialization.BaiTap.QuanLiSanPhamLuuRaFileNhiPhan.Model.ProductInformation;

public interface IRepoProductInformation {
    void add(ProductInformation productInformation);
    void list();
    void search(String name);
}
