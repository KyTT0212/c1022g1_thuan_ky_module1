package baiTapCodegymModule2.MVC.MVC2.Model.Model;

public class ManagementLibrary {
    //mã tài liệu
    private int documentCode;
    //tên nhà xuất bản
    private String nameImprint;
    //số bản phát hành
    private int releaseNumber;

    public ManagementLibrary() {
    }

    public ManagementLibrary(int documentCode, String nameImprint, int releaseNumber) {
        this.documentCode = documentCode;
        this.nameImprint = nameImprint;
        this.releaseNumber = releaseNumber;
    }

    public int getDocumentCode() {
        return documentCode;
    }

    public void setId(int documentCode) {
        this.documentCode = documentCode;
    }

    public String getNameImprint() {
        return nameImprint;
    }

    public void setNameImprint(String nameImprint) {
        this.nameImprint = nameImprint;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "ManagementLibrary{" +
                "documentCode=" + documentCode +
                ", nameImprint='" + nameImprint + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }

}
