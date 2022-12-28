package CaseStudy.Model.Service.Employee;

import CaseStudy.Model.Service.IService;
import CaseStudy.Model.model.Person.Employee;

public interface IEmployeeService extends IService {
  void list( );
  void add(Employee employee);
  Employee findByName(String name);
  void delete(Employee employee);
  void edit(Employee employee);
}
