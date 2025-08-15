package javacore.lambdaexpression.predicated;

public class Employee {
    private String name;
    private int salary;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
