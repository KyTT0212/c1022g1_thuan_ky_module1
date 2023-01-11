package Demo1.Model.Model.Person;

public class Customer extends Person{
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(String id, String ten, String ngaySinh, String gioiTinh, String soCMND, String SDT, String email, String loaiKhach, String diaChi) {
        super(id, ten, ngaySinh, gioiTinh, soCMND, SDT, email);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String
    toString() {
        return "Customer{" +
                "loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                "} " + super.toString();
    }
}
