package baiTapCodegymModule2.MVC.MVC2.Model.Service;

import baiTapCodegymModule2.MVC.MVC2.Model.Model.Book;
import baiTapCodegymModule2.MVC.MVC2.Model.Repository.RepoManagementLibrary;

public class ServiceManagementLibrary implements IServiceManagementLibrary {
    RepoManagementLibrary repoManagementLibrary = new RepoManagementLibrary();

    @Override
    public void add(Book book) {
        repoManagementLibrary.add(book);
    }

    @Override
    public void list() {
        repoManagementLibrary.list();
    }

}
