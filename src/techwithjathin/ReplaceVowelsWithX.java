package techwithjathin;

public class ReplaceVowelsWithX {
    public static void main(String[] args) {

        String input = "Ashin";
        String vowels = "AEIOUaeiou";
        char[] array = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<array.length;i++){
            if(vowels.indexOf(array[i])==-1){
                stringBuilder.append(array[i]);
            }
            else {
                stringBuilder.append("x");
            }
        }
        System.out.println(stringBuilder);
    }
}
