package baiTapCodegymModule2.MVC.MVC2.Model.Model;

public class Book extends ManagementLibrary{
    //tên tác giả
    private String name;
    //số trang
    private int numberOfPages;

    public Book() {
    }

    public Book(int documentCode, String nameImprint, int releaseNumber, String name, int numberOfPages) {
        super(documentCode, nameImprint, releaseNumber);
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
