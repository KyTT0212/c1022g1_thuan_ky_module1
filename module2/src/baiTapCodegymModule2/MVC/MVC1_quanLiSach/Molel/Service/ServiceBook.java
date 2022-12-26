package baiTapCodegymModule2.MVC.MVC1_quanLiSach.Molel.Service;

import baiTapCodegymModule2.MVC.MVC1_quanLiSach.Molel.Book;
import baiTapCodegymModule2.MVC.MVC1_quanLiSach.Molel.Repository.RepoBook;

public class ServiceBook implements IServiceBook {
    RepoBook repoBook = new RepoBook();


    @Override
    public void list() {
        repoBook.list();
    }

    @Override
    public Book findByName(String name) {
        return repoBook.findByName(name);
    }

    @Override
    public void list(Book book) {
        repoBook.list(book);
    }

    @Override
    public void update(Book book) {
        repoBook.update(book);
    }

    @Override
    public void remove(Book book) {

    }

    @Override
    public void add(Book book) {

    }
}
