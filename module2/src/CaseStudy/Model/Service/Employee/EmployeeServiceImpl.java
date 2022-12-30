package CaseStudy.Model.Service.Employee;

import CaseStudy.Model.Repository.Employee.EmployeeRepo;
import CaseStudy.Model.model.Person.Employee;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService{
    EmployeeRepo employeeRepo = new EmployeeRepo();

    @Override
    public void list() {
        employeeRepo.list();
    }

    @Override
    public void add(Employee employee) {
        employeeRepo.add(employee);
    }

    @Override
    public Employee findByName(String name) {
        return employeeRepo.findByName(name);
    }

    @Override
    public Employee findById(int id) {
        return employeeRepo.findById(id);
    }


    @Override
    public void delete(Employee employee) {
        employeeRepo.delete(employee);
    }

    @Override
    public void edit(Employee employee) {
        employeeRepo.edit(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }
}
