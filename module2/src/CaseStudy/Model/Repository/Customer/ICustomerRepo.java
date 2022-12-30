package CaseStudy.Model.Repository.Customer;

import CaseStudy.Model.model.Person.Customer;

import java.util.List;

public interface ICustomerRepo {
    void list();
    void add(Customer customer);
    Customer findByName(String name);
    Customer finById (int id);
    void edit(Customer customer);
    List<Customer> findAll();
}
