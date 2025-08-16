package javacore.stream.terminal.max;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxSample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,15,3,7,2,9);
        Optional<Integer> optionalInteger = list.stream().max((val1, val2)->val1.compareTo(val2));
        System.out.println(optionalInteger.get());
    }
}
