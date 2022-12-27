package CaseStudy.Model.Service.Customer;

import CaseStudy.Model.Service.IService;
import CaseStudy.Model.model.Person.Customer;

public interface ICustomerService extends IService {
    void list();
    void add(Customer customer);
    Customer findByName(String name);
    void edit(Customer customer);
}
