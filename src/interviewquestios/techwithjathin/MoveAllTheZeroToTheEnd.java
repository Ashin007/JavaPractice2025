package interviewquestios.techwithjathin;

public class MoveAllTheZeroToTheEnd {

    public static void main(String[] args) {

//        int[] array = {1,0,2,0,3,0,4,6,7,0,0,3,0};
//        int zeroCounter = 0;
//        int count = 0;
//        int[] newArray = new int[array.length];
//        for(int i=0;i<array.length;i++){
//            if(array[i]!=0){
//                newArray[count] = array[i];
//                count++;
//            }
//            else{
//                zeroCounter++;
//            }
//
//        }
//        for(int j=0;j<zeroCounter;j++){
//            newArray[count] = 0;
//        }
//        for(int value:newArray){
//            System.out.println(value);
//        }

        int[] a = {1,0,2,0,3,0,4,6,7,0,0,3,0};

        int putNonZeroValueHere = 0;
        int temp;//swapping

        for(int current=0;current<a.length;current++){
            if(a[current]!=0){
                //swap
                temp = a[putNonZeroValueHere];
                a[putNonZeroValueHere] = a[current];
                a[current] = temp;
                putNonZeroValueHere++;
            }
        }
        for(int no:a){
            System.out.println(no);
        }
    }

}
