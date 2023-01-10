package Model.Model.Person;

public class Employee extends Person{
    private String trinhDo;
    private String viTri;
    private String luong;

    public Employee() {
    }

    public Employee(String trinhDo, String viTri, String luong) {
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(String id, String ten, String ngaySinh, String gioiTinh, String soCMND, String SDT, String email, String trinhDo, String viTri, String luong) {
        super(id, ten, ngaySinh, gioiTinh, soCMND, SDT, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong='" + luong + '\'' +
                "} " + super.toString();
    }
}
