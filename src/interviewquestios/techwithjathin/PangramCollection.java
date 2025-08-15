package interviewquestios.techwithjathin;

import java.util.*;

public class PangramCollection {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        char[] array = input.toLowerCase().toCharArray();
        Set<Character> characters = new HashSet<>();

        for(char ch: array){
            if(Character.isLetter(ch)){
                characters.add(ch);
            }
        }
        if(characters.size()==26){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }

    }
}
