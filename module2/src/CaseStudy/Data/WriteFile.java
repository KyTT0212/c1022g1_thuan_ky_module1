package CaseStudy.Data;

import CaseStudy.Model.model.Person.Employee;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public static final String PATH_EMPLOYEE = "src\\CaseStudy\\Data\\Employee.csv";
    public static List<Employee> writeFileEmployee() {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(PATH_EMPLOYEE);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line;
            String arr[];
            Employee employee;
            while (line = bufferedWriter.ư

            );

//            for (Employee employee : writeFileEmployee() ){
//                bufferedWriter.write(employee.c);
//                bufferedWriter.newLine();
//                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
