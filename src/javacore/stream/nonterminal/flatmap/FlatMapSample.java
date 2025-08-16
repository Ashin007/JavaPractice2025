package javacore.stream.nonterminal.flatmap;

import java.util.Arrays;
import java.util.List;

public class FlatMapSample {

    public static void main(String[] args) {
        List<Integer>list1 = Arrays.asList(1,2);
        List<Integer>list2 = Arrays.asList(3,4);
        List<Integer>list3 = Arrays.asList(5,6);

        List<List<Integer>> finalList = Arrays.asList(list1,list2,list3);

        finalList.stream().flatMap(c->c.stream().map(l->l+10)).forEach(System.out::println);
    }
}
