package CaseStudy.Model.Service.Customer;

import CaseStudy.Model.model.Person.Customer;

import java.util.List;

public interface ICustomerService {
    void list();
    List<Customer> findAll();
    void add(Customer customer);
    Customer findByName(String name);
    Customer findById (int id);
    void edit(Customer customer);

}
