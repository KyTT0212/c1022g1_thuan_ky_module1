package ss12_JavaCollectionFramework.ArrayList.Model.Repository;

import ss12_JavaCollectionFramework.ArrayList.Model.model.ModelProduct;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositoryProductManager implements IRepositoryProductManager {
    private static List<ModelProduct> productList = new LinkedList<>();
    static {
        productList.add(new ModelProduct(1,"den",5.5));
        productList.add(new ModelProduct(2,"ban",4.6));
        productList.add(new ModelProduct(3,"ghe",2.8));
    }

    public RepositoryProductManager(int id) {
    }

    public static void findProduct(int id) {
    }

    @Override
    public void addProduc(int id, String nameProduc, double price) {

    }

    @Override
    public void updateProduc(int id) {

    }

    @Override
    public void removeProduc(int id) {

    }

    @Override
    public void listProduc() {

    }

    @Override
    public void searchProduc(String nameProduc) {

    }

    @Override
    public void sortAscendingOrder() {

    }

    @Override
    public void sortDescendingOrder() {

    }
}
