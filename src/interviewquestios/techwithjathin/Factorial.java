package interviewquestios.techwithjathin;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int input1 = 5;
        int result1=1;
        for(int i=1;i<=input1;i++){
            result1 = result1*i;
        }
        System.out.println(result1);

        int input = 500000;
        BigInteger result=BigInteger.ONE;
        for(int i=1;i<=input;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}
