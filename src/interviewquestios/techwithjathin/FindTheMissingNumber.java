package interviewquestios.techwithjathin;

public class FindTheMissingNumber {
    public static void main(String[] args) {

        int[] input = {1,2,3,5,6,7,8,9};
        int sum = 0;
        int expectedSum = 0;
        for(int i=0;i<input.length;i++){
            sum = sum+input[i];
        }
        for(int i=1;i<=input[input.length-1];i++){
            expectedSum = expectedSum+i;
        }
        System.out.println(sum);
        System.out.println(expectedSum);
        System.out.println("The missing number is: "+ (expectedSum-sum));
    }
}
