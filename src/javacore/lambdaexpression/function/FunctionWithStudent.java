package javacore.lambdaexpression.function;

import javacore.lambdaexpression.predicated.Employee;

import java.util.function.Function;

public class FunctionWithStudent {
    public static void main(String[] args) {
        // function will accept argument and return the object
        Function<Employee,String> function = f-> {
            if(f.getAge() > 18 && f.getSalary() > 20000){
                return f.getName();
            }
            return "User condition not met";
        };
        Employee employee = new Employee("Ashin",30000,21);
        System.out.println(function.apply(employee));

        Function<Integer,Integer> functionOne = f->f*f;
        Function<Integer,Integer> functionTwo = f->f*f*f;

        System.out.println(functionOne.apply(2));//2*2=4
        System.out.println(functionOne.andThen(functionTwo).apply(2));// 2*2=4, 4*4*4 = 64
        System.out.println(functionOne.compose(functionTwo).apply(2));// 2*2*2=8, 8*8 = 64
    }
}
