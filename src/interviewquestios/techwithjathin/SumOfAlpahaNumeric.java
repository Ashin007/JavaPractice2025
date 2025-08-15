package interviewquestios.techwithjathin;

public class SumOfAlpahaNumeric {
    public static void main(String[] args) {

        String input = "sd45f23sd34fs4fd454f10";
        char[] array = input.toCharArray();
        StringBuilder builder = new StringBuilder();
        int sum = 0;
        for (char data:array){
            if(Character.isDigit(data)){
                builder.append(data);
            }
            else{
                if(builder.length()!=0) {
                    sum += Integer.parseInt(builder.toString());
                    builder.setLength(0);
                }
            }

        }
        if(builder.length()!=0) {
            sum += Integer.parseInt(builder.toString());
        }
        System.out.println(sum);
    }
}
