package baiTapCodegymModule2.MVC.MVC2.Model.Repository;

import baiTapCodegymModule2.MVC.MVC2.Model.Model.Book;
import baiTapCodegymModule2.MVC.MVC2.Model.Model.Journal;
import baiTapCodegymModule2.MVC.MVC2.Model.Model.Newspaper;

import java.util.ArrayList;
import java.util.List;

public class RepoManagementLibrary implements IRepoManagementLibrary {
    static List<Book> myListBook = new ArrayList<>();
    static {
        myListBook.add(new Book(001,"NXB A",1120,"HÙNG",123));
        myListBook.add(new Book(002,"NXB B",1120,"ANH",456));
        myListBook.add(new Book(003,"NXB C",1120,"HOA",789));
    }

    static List<Journal> myListJournal = new ArrayList<>();
    static {
        myListJournal.add(new Journal(001,"NXB A",1000,123,12));
        myListJournal.add(new Journal(002,"NXB B",1000,147,1));
        myListJournal.add(new Journal(003,"NXB C",1000,159,7));
    }
    static List<Newspaper> myListNewspaper = new ArrayList<>();
    static {
        myListNewspaper.add(new Newspaper(001,"NXB A",200,30/12/2000));
        myListNewspaper.add(new Newspaper(002,"NXB B",200,1/1/2002));
        myListNewspaper.add(new Newspaper(003,"NXB C",200,11/7/2004));
    }

    @Override
    public void add(Book book) {
        myListBook.add(book);
    }

    @Override
    public void list() {
        for (int i = 0; i <myListBook.size() ; i++) {
            System.out.println(myListBook.get(i));
        }
    }

    @Override
    public void add(Journal journal) {
        myListJournal.add(journal);
    }

    @Override
    public void list(Journal journal) {
        for (int i = 0; i <myListJournal.size() ; i++) {
            System.out.println(myListJournal.get(i));
        }
    }

    @Override
    public void add(Newspaper newspaper) {
        myListNewspaper.add(newspaper);
    }

    @Override
    public void list(Newspaper newspaper) {
        for (int i = 0; i <myListNewspaper.size() ; i++) {
            System.out.println(myListNewspaper.get(i));
        }
    }
}
