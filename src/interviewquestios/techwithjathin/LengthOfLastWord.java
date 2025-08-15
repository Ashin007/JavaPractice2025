package interviewquestios.techwithjathin;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String input = "  Hello world here it is urit ";
        String[] inputArray = input.split(" ");

        System.out.println(inputArray[inputArray.length-1].length());
        System.out.println(input.length());

        String[] wordArray = input.trim().split(" ");
        for(int i=0;i< wordArray.length;i++){
            if(wordArray[i].length()%2==0){
                System.out.println(wordArray[i]+" is even");
            }
            else{
                System.out.println(wordArray[i]+" is odd");
            }
        }
    }



}
