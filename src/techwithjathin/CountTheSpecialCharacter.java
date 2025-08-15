package techwithjathin;

import java.util.HashMap;
import java.util.Map;

public class CountTheSpecialCharacter {
    public static void main(String[] args) {

        String input = "#ad#d%%f#";

        char[] array = input.toCharArray();

        Map<Character,Integer> map = new HashMap<>();
        for(char value:array){
            if(!(value>='a' && value<='z')){
                if(map.containsKey(value)){
                    map.put(value,map.get(value)+1);
                }
                else{
                    map.put(value,1);
                }
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
