package interviewquestios.techwithjathin;

import java.util.HashMap;
import java.util.Map;

public class CountTheFrequencyOfCharacters {
    public static void main(String[] args){ 

        String input = "malayalam";

        char[] charArray = input.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

       for(char value:charArray){
           if(map.containsKey(value)){
               map.put(value,map.get(value)+1);
           }
           else{
               map.put(value,1);
           }
       }
       for(char c: map.keySet()){
           System.out.println(c+" "+map.get(c));
       }
    }
}
