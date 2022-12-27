package CaseStudy.Model.Repository.Customer;

import CaseStudy.Model.model.Person.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements ICustomerRepo{
    static List<Customer> myCustomerList = new ArrayList<>();

    static {
        myCustomerList.add(new Customer(1,"Anh",02/4/2004,false,012345677544,0212565775,"hung@gmail.com","Gold","12/abcd,VN"));
        myCustomerList.add(new Customer(2,"Hoa",11/07/2004,true,026446654164,0754656665,"hoa123@gmail.com","Silver","485/zxc/adsd,VN"));
        myCustomerList.add(new Customer(3,"Nam",12/07/1998,false,000742475754,0754656665,"nammm147@gmail.com","Diamond","1445/sdzxa/China"));
    }
    @Override
    public void list() {
        for (int i = 0; i < myCustomerList.size(); i++) {
            System.out.println(myCustomerList.get(i));
        }
    }

    @Override
    public void add(Customer customer) {
        myCustomerList.add(customer);
    }

    @Override
    public Customer findByName(String name) {
        return null;
    }

    @Override
    public void edit(Customer customer) {

    }
}
