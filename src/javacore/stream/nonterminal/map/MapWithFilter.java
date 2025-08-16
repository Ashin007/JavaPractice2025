package javacore.stream.nonterminal.map;

import javacore.lambdaexpression.predicated.Employee;

import java.util.ArrayList;
import java.util.List;

public class MapWithFilter {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ashin",3000,21));
        employeeList.add(new Employee("Ashna",5000,51));
        employeeList.add(new Employee("Vijayan",400,23));
        employeeList.add(new Employee("Suvarna",8000,99));

        employeeList.stream().filter(emp->emp.getAge()<60 && emp.getSalary()>4000).map(emp->emp.getName()).forEach(System.out::println);
    }

}
