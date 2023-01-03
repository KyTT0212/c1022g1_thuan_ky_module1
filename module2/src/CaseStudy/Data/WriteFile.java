package CaseStudy.Data;

import CaseStudy.Model.model.Facility.Room;
import CaseStudy.Model.model.Facility.Villa;
import CaseStudy.Model.model.Person.Customer;
import CaseStudy.Model.model.Person.Employee;

import java.io.*;
import java.util.List;
import java.util.Map;

public class WriteFile {
    public static final String PATH_EMPLOYEE ="src\\CaseStudy\\Data\\CSV\\Employee.csv";
    public static final String PATH_CUSTOMER = "src\\CaseStudy\\Data\\CSV\\Customer.csv";
    public static final String PATH_ROOM = "src\\CaseStudy\\Data\\CSV\\Room.csv";
    public static final String PATH_VILLA = "src\\CaseStudy\\Data\\CSV\\Villa.csv";
    public static final String PATH_BOOKING = "";


    public static void writeEmployee(List<Employee> writeFileEmployee)  {
        try {
            FileWriter fileWriter = new FileWriter(PATH_EMPLOYEE);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e : writeFileEmployee) {
                bufferedWriter.write(e.getId()+","+e.getName()+","+e.getDateOfBirth()+","+e.getSex()+","+e.getNumCMND()+","+e.getNumPhone()+","+e.getEmail()+","+e.getLevel()+","+e.getPosition()+","+e.getWage());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeCustomer(List<Customer> writeFileCustomer) {
        try {
            FileWriter fileWriter = new FileWriter(PATH_CUSTOMER);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer c: writeFileCustomer){
                bufferedWriter.write(c.getId()+","+c.getName()+","+c.getDateOfBirth()+","+c.getSex()+","+c.getNumCMND()+","+c.getNumPhone()+","+c.getEmail()+","+c.getCustomerType()+","+c.getAddress());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void writeRoom(Map<Room,Integer> writeFileRoom) {
        try {
            FileWriter fileWriter = new FileWriter(PATH_ROOM);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Room r : writeFileRoom.keySet()){
                bufferedWriter.write(r+","+writeFileRoom.get(r));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void writeVilla(Map<Villa,Integer> writeFileVilla) {
        try {
            FileWriter fileWriter = new FileWriter(PATH_VILLA);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa v : writeFileVilla.keySet()){
                bufferedWriter.write(v+","+writeFileVilla.get(v));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
