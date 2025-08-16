package javacore.stream.nonterminal.flatmap;

import javacore.lambdaexpression.predicated.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentFlapMap {
    public static void main(String[] args) {
        List<Employee> employeeListOne = new ArrayList<>();
        employeeListOne.add(new Employee("Ashin",3000,21));
        employeeListOne.add(new Employee("Ashna",5000,51));

        List<Employee> employeeListTwo = new ArrayList<>();
        employeeListTwo.add(new Employee("Vijayan",400,23));
        employeeListTwo.add(new Employee("Suvarna",8000,99));

        List<List<Employee>> finalListOne = Arrays.asList(employeeListOne,employeeListTwo);
        List<List<Employee>> finalListTwo = Arrays.asList(employeeListOne,employeeListTwo);

        finalListTwo.stream().flatMap(c->c.stream().map(b->b.getName())).forEach(System.out::println);

        List<List<List<Employee>>> lastFinalList = Arrays.asList(finalListOne,finalListTwo);

        lastFinalList.stream().flatMap(c->c.stream().flatMap(k->k.stream()).map(b->b.getName())).forEach(System.out::println);



    }
}
