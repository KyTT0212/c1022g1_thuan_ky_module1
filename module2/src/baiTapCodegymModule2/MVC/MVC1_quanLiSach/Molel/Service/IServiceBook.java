package baiTapCodegymModule2.MVC.MVC1_quanLiSach.Molel.Service;

import baiTapCodegymModule2.MVC.MVC1_quanLiSach.Molel.Book;

public interface IServiceBook {
    void list();
    Book findByName(String name);
    void list(Book book);
    void update(Book book);
    void remove(Book book);
    void add(Book book);
}
