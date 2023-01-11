package Demo1.Model.Repository.EmployeeRepo;

import Demo1.Model.Model.Person.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo implements IEmployeeRepo {
    static List<Employee> myEmployeeList = new ArrayList<>();
    static {
        myEmployeeList.add(new Employee("1","2","3","4","5","6","7","8","9","10"));
    }
    @Override
    public void list() {
        for (int i = 0; i <myEmployeeList.size() ; i++) {
            System.out.println(myEmployeeList.get(i));
        }
    }

    @Override
    public void add(Employee employee) {
        myEmployeeList.add(employee);
    }
}
