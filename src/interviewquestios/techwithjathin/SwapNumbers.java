package interviewquestios.techwithjathin;

public class SwapNumbers {
    public static void main(String[] args){

        // using extra variable
        int a = 20;
        int b = 30;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a: "+a);
        System.out.println("b: "+b);

        //without using an extra variable
        int c = -1420;
        int d = 30;

        c = c+d;
        d = c-d;
        c=c-d;
        System.out.println("c: "+c);
        System.out.println("d: "+d);

        //bitwise operation ExOr
        int e = 40;
        int f = 68;

        e = e^f;
        f = e^f;
        e = e^f;

        System.out.println("e:"+e);
        System.out.println("f:"+f);


    }
}
