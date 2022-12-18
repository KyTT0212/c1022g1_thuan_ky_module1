package ss12_JavaCollectionFramework.ArrayList.Model.Service;

import ss12_JavaCollectionFramework.ArrayList.Model.Repository.RepositoryProductManager;
import ss12_JavaCollectionFramework.ArrayList.Model.model.ModelProduct;

public class ServiceProductManager implements IServiceProductManager{


    protected static Object remove;

    protected static void findProducById(int id) {
        return RepositoryProductManager.findProduct(id);
    }

    protected static void updateProduct(ModelProduct p) {
        return;
    }

    protected static void removeProduct(int id) {
        return;
    }

    protected static void listProduct() {
        return;
    }

    protected static void seatchProduct(Object nameProduct) {
        return;
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
