package Model.Repository.EmployeeRepo;

import Model.Model.Person.Employee;

public interface IEmployeeRepo {
    void list();
    void add(Employee employee);
}


