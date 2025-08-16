package javacore.stream.terminal.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceSample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A","B","C","D","E","F","G");
        Optional<String> stringOptional = stringList.stream().reduce((value, combined)->value+combined);
        System.out.println(stringOptional.get());
    }
}
