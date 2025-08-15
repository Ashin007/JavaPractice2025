package javacore.lambdaexpression.consumer;

import java.util.function.Consumer;

public class SampleConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = f-> System.out.println(f);
        consumer.accept("Welcome");
    }
}
