package techwithjathin;

public class HollowPyramid {
    public static void main(String[] args) {
        int lastIndex = 10;
        for(int i=1;i<=lastIndex;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i) {
                    System.out.print(j);
                }
                else if(i==lastIndex){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
