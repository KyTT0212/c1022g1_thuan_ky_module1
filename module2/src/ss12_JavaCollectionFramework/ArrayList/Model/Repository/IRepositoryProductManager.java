package ss12_JavaCollectionFramework.ArrayList.Model.Repository;

public interface IRepositoryProductManager {
    void addProduc(int id, String nameProduc, double price);
    void updateProduc(int id);
    void removeProduc(int id);
    void listProduc();
    void searchProduc(String nameProduc);
    void sortAscendingOrder();
    void sortDescendingOrder();

}
