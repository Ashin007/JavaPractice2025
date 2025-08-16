package javacore.stream.nonterminal.limit;

import java.util.Arrays;
import java.util.List;

public class LimitSample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,3,7,2,9);
        list.stream().limit(3).forEach(System.out::println);
    }
}
