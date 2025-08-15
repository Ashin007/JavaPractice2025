package techwithjathin;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharcterFromString {
    public static void main(String[] args) {

        String input = "abcbdcedce";
        Set<Character> set = new LinkedHashSet<>();

        char[] array = input.toCharArray();

        for (char a:array){
            set.add(a);
        }
        System.out.println(set);
    }
}
