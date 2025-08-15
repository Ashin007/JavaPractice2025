package techwithjathin;

public class PangramValidation {
    public static void main(String[] args) {

        String input = "AbcdEfghijklmnopqrstuvwxz0y";
        boolean isAnagram = true;
        char[] array = input.toLowerCase().toCharArray();

        if(array.length<=24){
            isAnagram = false;
        }
        else {
            for (int i = 'a'; i<='z'; i++) {
                if (input.toLowerCase().indexOf(i)==-1) {
                    isAnagram = false;
                    break;
                }
            }
        }
        if(isAnagram)
            System.out.println("Anagaram");
        else
            System.out.println("Not anagram");
    }
}
