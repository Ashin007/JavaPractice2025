package complexproblem;

import java.util.HashMap;
import java.util.Map;

/******************************************************************************

 N people live in a town. The houses are arranged in a row.
 The personality of each owner is represented by a lowercase English character.
 Each person is in a fight with all those people who have a mirror personality to the one in the fight.

 'a' is a mirror of 'z' and vice versa
 'b' is a mirror of 'y' and vice versa
 and so




 *******************************************************************************/
public class PeopleFight {

    public static void main(String[] args){

        calculateFight(3,"aabbz");
    }
    public static void calculateFight(int totalNumber,String inputString){

        int fight = 0;
        char[] array = inputString.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(!(map.containsKey(array[i]))){
                map.put(array[i],1);
            }
            else{
                map.put(array[i],map.get(array[i])+1);
            }
        }

        for(int i=0;i<array.length;i++){
           char mirror = (char)('z'-(array[i]-'a'));
            if(map.get(mirror)!=null){
                fight +=map.get(mirror);
            }

        }

        System.out.println(fight/2);
    }
}
