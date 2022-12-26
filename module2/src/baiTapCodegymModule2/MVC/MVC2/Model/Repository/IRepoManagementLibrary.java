package baiTapCodegymModule2.MVC.MVC2.Model.Repository;

import baiTapCodegymModule2.MVC.MVC2.Model.Model.Book;
import baiTapCodegymModule2.MVC.MVC2.Model.Model.Journal;
import baiTapCodegymModule2.MVC.MVC2.Model.Model.ManagementLibrary;
import baiTapCodegymModule2.MVC.MVC2.Model.Model.Newspaper;

public interface IRepoManagementLibrary {
//    BOOK
    void add(Book book);
    void list();


//    Journal
    void add(Journal journal);
    void list(Journal journal);


//    Newspaper
    void add(Newspaper newspaper);
    void list(Newspaper newspaper);
}
