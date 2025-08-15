package techwithjathin;

public class ReverseOfInteger {
    public static void main(String[] args) {

        int a = 2147483647;
        int result = 0;
        int remainder;
        while(a!=0){
            remainder = a%10;
            result = result*10+remainder;
            a = a/10;
        }
        System.out.println(result);
    }
}
