package interviewquestios.techwithjathin;

public class ReverseVowels {
    public static void main(String[] args) {

        String input = "Hello";
        char[] array = input.toCharArray();
        String vowels = "AEIOUaeiou";
        int left = 0;
        int right = array.length-1;

        while(left<right){
            if(vowels.indexOf(array[left])==-1){
                left++;
            }
            else if(vowels.indexOf(array[right])==-1){
                right++;
            }
            else{
                char temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(array);
    }
}
