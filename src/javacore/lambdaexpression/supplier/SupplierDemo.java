package javacore.lambdaexpression.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<Date> supplier = ()->new Date();//won't accept any arguments, but it will return object
        System.out.println(supplier.get());
    }
}
