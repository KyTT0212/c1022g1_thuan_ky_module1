package baiTapCodegymModule2.MVC.MVC2.Model.Model;


//Báo
public class Newspaper extends ManagementLibrary{
     private int dateOfManufacture;

    public Newspaper() {
    }

    public Newspaper(int documentCode, String nameImprint, int releaseNumber, int dateOfManufacture) {
        super(documentCode, nameImprint, releaseNumber);
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(int dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "dateOfManufacture=" + dateOfManufacture +
                '}';
    }
}
