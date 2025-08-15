package javacore.lambdaexpression.consumer;

import javacore.lambdaexpression.predicated.Employee;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("ashin",32341,31);
        Employee employee1 = new Employee("Vijayan",232231,23);
        Employee employee2 = new Employee("suvarna",36231,34);
        Employee employee3 = new Employee("Suvarna",321,45);
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        Function<Employee,Integer> function = f->(f.getSalary()/10);
        Predicate<Integer> predicate = p->(p>1000);
        Consumer<Employee> consumer = c->System.out.println(c.getName());

        for(Employee emp:employeeList){
            int value = function.apply(emp);
            if(predicate.test(value))
                consumer.accept(emp);
        }
    }
}
