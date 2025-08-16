package javacore.stream.nonterminal.distinct;

import java.util.Arrays;
import java.util.List;

public class DistinctSample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,3,7,2,9);
        list.stream().distinct().forEach(System.out::println);
    }
}
