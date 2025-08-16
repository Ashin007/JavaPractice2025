package javacore.stream.nonterminal.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterSample {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(10,15,20,25,30);
        numberList.stream().filter(n->n%2==0).forEach(System.out::println);
        List<Integer> evenList = numberList.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println(evenList);
    }
}
