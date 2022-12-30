package CaseStudy.Model.Service.Employee;

import CaseStudy.Model.model.Person.Employee;

import java.util.List;

public interface IEmployeeService {
  void list();
  void add(Employee employee);
  Employee findByName(String name);
  Employee findById(int id);
  void delete(Employee employee);
  void edit(Employee employee);
  List<Employee> findAll();}
