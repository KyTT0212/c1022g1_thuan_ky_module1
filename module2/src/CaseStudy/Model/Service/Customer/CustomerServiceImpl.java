package CaseStudy.Model.Service.Customer;

import CaseStudy.Model.Repository.Customer.CustomerRepo;
import CaseStudy.Model.model.Person.Customer;

public class CustomerServiceImpl implements ICustomerService{
    CustomerRepo customerRepo = new CustomerRepo();

    @Override
    public void list() {
        customerRepo.list();
    }

    @Override
    public void add(Customer customer) {
        customerRepo.add(customer);
    }

    @Override
    public Customer findByName(String name) {
        return customerRepo.findByName(name);
    }

    @Override
    public void edit(Customer customer) {
        customerRepo.edit(customer);
    }

}
