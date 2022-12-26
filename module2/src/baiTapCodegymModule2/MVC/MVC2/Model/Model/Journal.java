package baiTapCodegymModule2.MVC.MVC2.Model.Model;

//tạp chí
public class Journal extends ManagementLibrary {
    //số phát hành
    private int id;
    //thánh phát hành
    private int month;

    public Journal() {
    }

    public Journal(int documentCode, String nameImprint, int releaseNumber, int id, int month) {
        super(documentCode, nameImprint, releaseNumber);
        this.id = id;
        this.month = month;
    }

    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "id=" + id +
                ", month=" + month +
                '}';
    }
}
