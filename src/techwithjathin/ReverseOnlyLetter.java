package techwithjathin;

public class ReverseOnlyLetter {
    public static void main(String[] args) {

        String input = "a1ab22";

        char[] array = input.toCharArray();//{1,a,b,2}
        // two pointer solution
        int left = 0;
        int right = array.length-1;
        char temp = 0;
        while(left<right){
            if(!Character.isLetter(array[left])){
                left++;
            }
            else if(!Character.isLetter(array[right])){
                right--;
            }
            else{
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(array);

    }
}
