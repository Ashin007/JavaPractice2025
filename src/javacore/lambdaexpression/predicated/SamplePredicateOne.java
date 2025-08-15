package javacore.lambdaexpression.predicated;

import java.util.function.Predicate;

public class SamplePredicateOne {
    public static void main(String[] args) {
        //predicate will accept the object and return the boolean value
        Employee employee = new Employee("Ashin",67000,31);
        Predicate<Employee> predicate = t->(t.getAge()>18 && t.getSalary()>13000);
        Predicate<Employee> predicate1 = t->(t.getAge()>18 && t.getSalary()>13000);
        System.out.println(predicate.test(employee));
        predicate.or(predicate1).test(employee);
    }
}

