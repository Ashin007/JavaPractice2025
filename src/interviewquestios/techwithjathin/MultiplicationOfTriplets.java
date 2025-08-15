package interviewquestios.techwithjathin;

import java.util.Arrays;

public class MultiplicationOfTriplets {
    public static void main(String[] args) {



        int[] array = new int[] {-2,-4,-6,8,4,2,16};
        solutionWithoutSort(array);
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int sum=1,sum1 =1;
//        for(int i=0;i<3;i++){
//            sum *=array[i];
//        }
//        for(int i=array.length-1;i>array.length-4;i--){
//            sum1 *=array[i];
//        }
//        System.out.println(Math.max(sum,sum1));
    }
    public static void solutionWithoutSort(int[] array){
        System.out.println(Arrays.toString(array));

        int maxOne = Integer.MIN_VALUE;
        int maxTwo = Integer.MIN_VALUE;
        int maxThree = Integer.MIN_VALUE;
        int minOne = Integer.MAX_VALUE;
        int minTwo  = Integer.MAX_VALUE;

        for(int value: array){
            if(value<minOne){
                minTwo = minOne;
                minOne = value;
            }
            else if(value<minTwo){
                minTwo = value;
            }else if(value>maxOne){
                maxThree = maxTwo;
                maxTwo = maxOne;
                maxOne = value;
            }
            else if(value>maxTwo){
                maxThree = maxTwo;
                maxTwo = value;
            }
            else if(value>maxThree){
                maxThree = value;
            }

        }
        int sum1 = maxOne*maxTwo*maxThree;
        int sum2 = minOne*minTwo*maxOne;

        System.out.println(Math.max(sum1,sum2));
    }
}
