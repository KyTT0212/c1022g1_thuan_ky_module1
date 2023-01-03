package CaseStudy.Data;

import CaseStudy.Model.model.Facility.Falicity;
import CaseStudy.Model.model.Person.Customer;
import CaseStudy.Model.model.Person.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static final String PATH_EMPLOYEE = "src\\CaseStudy\\Data\\Employee.csv";
    public static final String PATH_CUSTOMER = "";
    public static final String PATH_FACILITY = "";
    public static final String PATH_BOOKING = "";




    public static List<Employee> readFileEmployee() {
        List<Employee> myEmployeeList = new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(PATH_EMPLOYEE);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String arr[];
            Employee employee;

            while ((line = bufferedReader.readLine()) != null) {

                arr = line.split(",");
                String id = arr[0];
                String name = arr[1];
                String dateOfBirth = arr[2];
                String sex = arr[3];
                String numCMND = arr[4];
                String numPhone = arr[5];
                String email = arr[6];
                String level = arr[7];
                String position = arr[8];
                String wage = arr[9];

                employee = new Employee(id, name, dateOfBirth, sex, numCMND, numPhone, email, level, position, wage);
                myEmployeeList.add(employee);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return myEmployeeList;
    }


    List<Customer> readFileCustomer() {
        List<Customer> myCustomerList = new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(PATH_CUSTOMER);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String arr[];
            Customer customer;

            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                String id = arr[0];
                String name = arr[1];
                String dateOfBirth = arr[2];
                String sex = arr[3];
                String numCMND = arr[4];
                String numPhone = arr[5];
                String email = arr[6];
                String customerType = arr[7];
                String address = arr[8];

                customer = new Customer(id,name,dateOfBirth,sex,numCMND,numPhone,email,customerType,address);
                myCustomerList.add(customer);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return myCustomerList;
    }


    List<Falicity> readFileFalicity(){
        List<Falicity> myFalicityList = new ArrayList<>();
    }


}