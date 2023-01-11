package bai3.Model.Model;

public class NganHang {
//    public static int SoThuTu = 1;
    private int soThuTu = 1;
    private String maSoTietKiem;
    private int soTien;
    private String kyHan;
    private int laiSuat;
    private String maKhachHang;

    public NganHang() {
    }

    public NganHang(int soThuTu, String maSoTietKiem, int soTien, String kyHan, int laiSuat, String maKhachHang) {
        this.soThuTu = soThuTu;
        this.maSoTietKiem = maSoTietKiem;
        this.soTien = soTien;
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
        this.maKhachHang = maKhachHang;
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getMaSoTietKiem() {
        return maSoTietKiem;
    }
    public void setMaSoTietKiem(String maSoTietKiem) {
        this.maSoTietKiem = maSoTietKiem;
    }

    public int getSoTien() {
        return soTien;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    public int getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(int laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

//    public String setDangKiSoTietKiem(String dangKiSoTietKiem){
//        return dangKiSoTietKiem;
//    }

    @Override
    public String toString() {
        return "NganHang{" +
                "maSoTietKiem='" + maSoTietKiem + '\'' +
                ", soTien='" + soTien + '\'' +
                ", kyHan='" + kyHan + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                '}';
    }
}
