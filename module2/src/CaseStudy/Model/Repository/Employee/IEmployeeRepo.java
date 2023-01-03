package CaseStudy.Model.Repository.Employee;

import CaseStudy.Model.model.Person.Employee;

import java.util.List;

public interface IEmployeeRepo {
    void list( );
    void add(Employee employee);
    Employee findByName(String name);
    Employee findById(String id);
    void delete(Employee employee);
    void edit(Employee employee);
    List<Employee> findAll();
}
