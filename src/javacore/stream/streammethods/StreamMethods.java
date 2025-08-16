package javacore.stream.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(2,33,45,56,34,7,3);

        Optional<Integer> findAny = integerList.stream().findAny();// find any of the element
        System.out.println(findAny.get());
        System.out.println(integerList.stream().allMatch(e->e>10));//return true if condition true for all the condition
        System.out.println(integerList.stream().noneMatch(e->e>10));//return true if none of the condition is true
        Stream<Integer> stream1 = integerList.stream();
        Stream<Integer> stream2 = integerList.stream();

        List<Integer> list = Stream.concat(stream1,stream2).collect(Collectors.toList());//concatenate two stream
    }
}
