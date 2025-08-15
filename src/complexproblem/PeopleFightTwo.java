package complexproblem;
/******************************************************************************

 N people live in a town. The houses are arranged in a row.
 The personality of each owner is represented by a lowercase English character.
 Each person is in a fight with all those people who have a mirror personality to the one in the fight.

 'a' is a mirror of 'z' and vice versa
 'b' is a mirror of 'y' and vice versa
 and so




 *******************************************************************************/
import java.util.*;
public class PeopleFightTwo
{
    public static void main (String[]args)
    {
        System.out.println (solution(3, "aabbz"));  // 2 fights
        System.out.println (solution(10, "wjlahohpec"));  // 1 fight
    }

    static int solution (int N, String S)
    {
        // Write your code here
        int fights = 0;

        Map<Character, Integer> map = new HashMap<>();
        char[] charArr = S.toCharArray ();

        for (int i = 0; i < charArr.length; i++)
        {
            if(map.get(charArr[i]) == null) {
                map.put(charArr[i], 1);
            } else {
                map.put(charArr[i], map.get(charArr[i]) + 1);
            }
        }

        for (int i = 0; i < charArr.length; i++)
        {
            char mirrorChar = (char) ('z' - (charArr[i] - 'a'));
            if(map.get(mirrorChar) != null) {
                fights += map.get(mirrorChar);
            }

        }

        return fights / 2;
    }

}
