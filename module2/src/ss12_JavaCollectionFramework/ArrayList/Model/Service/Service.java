package ss12_JavaCollectionFramework.ArrayList.Model.Service;


import ss12_JavaCollectionFramework.ArrayList.Model.Product;
import ss12_JavaCollectionFramework.ArrayList.Model.Repository.Repository;

public class Service implements IService {
    Repository repository = new Repository();

    @Override
    public void add(Product product) {
        repository.add(product);
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void update(Product product) {
        repository.update(product);
    }

    @Override
    public void remove(Product product) {
        repository.remove(product);
    }

    @Override
    public void list() {
        repository.list();
    }

//    @Override
//    public void search(String name) {
//
//    }
//
//    @Override
//    public void sortAscendingOrder() {
//
//    }
//
//    @Override
//    public void sortDescendingOrder() {
//
//    }
}
