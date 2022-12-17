package ss12_JavaCollectionFramework.ArrayList.Model.Service;

public interface IServiceProductManager {
    void addProduc(int id, String nameProduc, double price);
    void updateProduc(int id);
    void removeProduc(int id);
    void listProduc();
    void searchProduc(String nameProduc);
    void sortAscendingOrder();
    void sortDescendingOrder();
}
