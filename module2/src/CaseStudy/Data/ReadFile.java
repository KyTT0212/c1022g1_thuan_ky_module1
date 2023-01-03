package CaseStudy.Data;

import CaseStudy.Model.model.Facility.Room;
import CaseStudy.Model.model.Facility.Villa;
import CaseStudy.Model.model.Person.Customer;
import CaseStudy.Model.model.Person.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadFile {
    public static final String PATH_EMPLOYEE = "src\\CaseStudy\\Data\\CSV\\Employee.csv";
    public static final String PATH_CUSTOMER = "src\\CaseStudy\\Data\\CSV\\Customer.csv";
    public static final String PATH_ROOM = "src\\CaseStudy\\Data\\CSV\\Room.csv";
    public static final String PATH_VILLA = "src\\CaseStudy\\Data\\CSV\\Villa.csv";
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
            System.err.println("FileNotFoundException");
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


    public static List<Customer> readFileCustomer() {
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

                customer = new Customer(id, name, dateOfBirth, sex, numCMND, numPhone, email, customerType, address);
                myCustomerList.add(customer);
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
        return myCustomerList;
    }


    public static Map<Room, Integer> readFileRoom() {
        Map<Room, Integer> myRoomList = new LinkedHashMap<>();
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(PATH_ROOM);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String arr[];
            Room room;

            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                String serviceName = arr[0];
                String usableArea = arr[1];
                String price = arr[2];
                String peopleMaximum = arr[3];
                String rentalType = arr[4];
                String accompaniedServiceFree = arr[5];

                room = new Room(serviceName, usableArea, price, peopleMaximum, rentalType, accompaniedServiceFree);
                myRoomList.put(room, 0);
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
        return myRoomList;
    }


    public static Map<Villa, Integer> readFileVilla() {
        Map<Villa, Integer> myVillaList = new LinkedHashMap<>();
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(PATH_VILLA);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String arr[];
            Villa villa;

            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                String serviceName = arr[0];
                String usableArea = arr[1];
                String price = arr[2];
                String peopleMaximum = arr[3];
                String rentalType = arr[4];
                String standard = arr[5];
                String swimmingArea = arr[6];
                String numFloors = arr[7];

                villa = new Villa(serviceName, usableArea, price, peopleMaximum, rentalType, standard, swimmingArea, numFloors);
                myVillaList.put(villa, 0);
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
        return myVillaList;
    }
}