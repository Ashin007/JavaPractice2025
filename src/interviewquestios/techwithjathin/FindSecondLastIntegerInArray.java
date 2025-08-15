package interviewquestios.techwithjathin;

public class FindSecondLastIntegerInArray {
    public static void main(String[] args) {

        int[] inputArray = {99,48,3,44,5,6,7,201};
        int firstLarge = 0;
        int secondLarge = 0;

        for(int value:inputArray){
            if(value>firstLarge){
                secondLarge = firstLarge;
                firstLarge = value;
                continue;
            }
            if(value>secondLarge){
                secondLarge = value;
            }
        }
        System.out.println(secondLarge);

    }
}
