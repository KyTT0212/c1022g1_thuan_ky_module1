package ss12_JavaCollectionFramework.ArrayList.Model.Repository;

import ss12_JavaCollectionFramework.ArrayList.Model.Product;

public interface IRepository {
    void add(Product product);

    Product findById (int id);
    void update( Product product);
    void remove(Product product);
    void list();
//    void search(String name);
//    void sortAscendingOrder();
//    void sortDescendingOrder();
}
