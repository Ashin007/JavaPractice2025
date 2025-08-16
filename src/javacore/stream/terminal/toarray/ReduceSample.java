package javacore.stream.terminal.toarray;

import java.util.Arrays;
import java.util.List;

public class ReduceSample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A","B","C","D","E","F","G");
        Object[] array = stringList.stream().toArray();
        System.out.println(array.length);
        for (Object ob:array) {
            System.out.println(ob);
        }
    }
}
