package javacore.stream.terminal.count;

import java.util.Arrays;
import java.util.List;

public class CountSample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,3,7,2,9);
        System.out.println(list.stream().count());
    }
}
