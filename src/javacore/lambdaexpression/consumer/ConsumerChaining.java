package javacore.lambdaexpression.consumer;

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {

        //consumer will accept one argument and return nothing
        Consumer<String> consumerOne = c-> System.out.println(c+" is from consumer one");
        Consumer<String> consumerTwo = c-> System.out.println(c+" is from consumer two");
        Consumer<String> consumerThree = c-> System.out.println(c+" is from consumer three");

        consumerOne.andThen(consumerTwo).andThen(consumerThree).accept("Ashin");
    }
}
