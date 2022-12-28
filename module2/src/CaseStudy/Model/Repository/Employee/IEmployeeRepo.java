package CaseStudy.Model.Repository.Employee;

import CaseStudy.Model.model.Person.Employee;

public interface IEmployeeRepo {
    void list( );
    void add(Employee employee);
    Employee findByName(String name);
    void delete(Employee employee);
    void edit(Employee employee);
}
