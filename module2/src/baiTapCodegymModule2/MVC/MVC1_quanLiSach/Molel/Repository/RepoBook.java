package baiTapCodegymModule2.MVC.MVC1_quanLiSach.Molel.Repository;

import baiTapCodegymModule2.MVC.MVC1_quanLiSach.Molel.Book;

import java.util.ArrayList;
import java.util.List;

public class RepoBook implements IRepoBook  {
    static List<Book> myBookList = new ArrayList<>();

    static {
        myBookList.add(new Book(1,"anh","blue",5.8));
        myBookList.add(new Book(2,"văn","red",7.2));
        myBookList.add(new Book(3,"toán","pink",9.7));
    }


    @Override
    public void list() {
        for (int i = 0; i <myBookList.size() ; i++) {
            System.out.println(myBookList.get(i));
        }
    }

    @Override
    public Book findByName(String name) {
        for (Book x : myBookList) {
            if (x.getName() == name){
                return x;
            }
        }
        return null;
    }

    @Override
    public void list(Book book) {
        for (int i = 0; i <myBookList.size() ; i++) {
            if (myBookList.get(i).getName()== book.getName()){
                myBookList.get(i);
            }
        }
    }

    @Override
    public void update(Book book) {
        for (int i = 0; i <myBookList.size() ; i++) {
            if (myBookList.get(i).getName()==book.getName()){
                myBookList.set(i,book);
            }
        }
    }

    @Override
    public void remove(Book book) {

    }

    @Override
    public void add(Book book) {

    }
}
