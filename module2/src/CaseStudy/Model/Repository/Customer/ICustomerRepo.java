package CaseStudy.Model.Repository.Customer;

import CaseStudy.Model.model.Person.Customer;

public interface ICustomerRepo {
    void list();
    void add(Customer customer);
    Customer findByName(String name);
    void edit(Customer customer);
}
