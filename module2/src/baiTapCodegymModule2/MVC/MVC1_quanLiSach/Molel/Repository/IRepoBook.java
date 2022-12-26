package baiTapCodegymModule2.MVC.MVC1_quanLiSach.Molel.Repository;

import baiTapCodegymModule2.MVC.MVC1_quanLiSach.Molel.Book;

public interface IRepoBook {
    void list();
    Book findByName(String name);
    void list(Book book);
    void update(Book book);
    void remove(Book book);
    void add(Book book);

}
