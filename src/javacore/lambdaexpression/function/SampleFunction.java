package javacore.lambdaexpression.function;

import java.util.function.Function;

public class SampleFunction {
    public static void main(String[] args) {
        Function<Integer,Integer> function = n->n*n;
        System.out.println(function.apply(50));
    }
}
