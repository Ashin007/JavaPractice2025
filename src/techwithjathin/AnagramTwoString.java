package techwithjathin;

public class AnagramTwoString {
    public static void main(String[] args){

        System.out.println(isAnagram("anagramm","marganaa"));

    }
    static boolean isAnagram(String a, String b) {
        boolean isAnagram = false;
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        int[] frequency = new int[26];

        for(int i=0;i<aArray.length;i++){
            char currentCharacter = a.charAt(i);
            if(currentCharacter>='a' && currentCharacter<='z'){
                frequency[currentCharacter-'a']++;
            }
        }

        for(int i=0;i<bArray.length;i++){
            char currentCharacter = b.charAt(i);
            if(currentCharacter>='a' && currentCharacter<='z'){
                frequency[currentCharacter-'a']--;
            }
        }

        for(int count: frequency){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
