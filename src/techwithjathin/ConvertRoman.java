package techwithjathin;

import java.util.HashMap;
import java.util.Map;

public class ConvertRoman {
    public static void main(String[] args) {

        methodTwo();
        System.out.println("-----------");
        String input = "IV";
        int result = 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('V',5);
        map.put('I',1);
        int firstNumber = 0;
        char[] array = input.toCharArray();

        for(int i=array.length-1;i>=0;i--){
            if((map.get(array[array.length-1]))>(map.get(array[array.length-2]))){
                System.out.println(map.get(array[i]));
                result =result-(map.get(array[i]));
            }
            else{
                result = result + map.get(array[i]);
            }

        }
        System.out.println(result);
    }

    public static void methodTwo(){

        String input = "III";
        char[] array = input.toCharArray();

        int result = 0;

        int previousValue = 0;

        Map<Character,Integer> map = new HashMap<>();
        map.put('V',5);
        map.put('I',1);

        for(int i=array.length-1;i>=0;i--){
            int currentValue = map.get(array[i]);
            if(currentValue<previousValue){
                result = result-currentValue;
            }
            else{
                result = result+currentValue;
            }
            previousValue = currentValue;
        }
        System.out.println(result);
    }
}
