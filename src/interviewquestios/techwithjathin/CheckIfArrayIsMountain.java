package interviewquestios.techwithjathin;

public class CheckIfArrayIsMountain {
    public static void main(String[] args) {

        int i = 0;
        int[] array = new int[] {1,2,4,6,8,12,15,13,21,9,5,3};

        while (i+1<array.length && array[i]<array[i+1]){
            i++;
        }
        while(i+1<array.length && array[i]>array[i+1]){
            i++;
        }
        if(array.length-1==i){
            System.out.println("Mountain array");
        }
        else{
            System.out.println("Not a mountain array");
        }
    }
}
