package Demo1.Model.Service.Employee;

import Demo1.Model.Model.Person.Employee;
import Demo1.Model.Repository.EmployeeRepo.EmployeeRepo;

public class EmployeeService implements IEmployeeService {
    EmployeeRepo employeeRepo = new EmployeeRepo();

    @Override
    public void list() {
        employeeRepo.list();
    }

    @Override
    public void add(Employee employee) {
        employeeRepo.add(employee);
    }
}
