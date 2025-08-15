package techwithjathin;

public class CovertCapitalIntoSmallAndSmallIntoCapial {
    public static void main(String[] args) {

        String input = "This is GOINg to be The Start";
        char[] array = input.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(char data:array){
            if(Character.isUpperCase(data)){
                builder.append(Character.toLowerCase(data));
            }
            else if(Character.isLowerCase(data)){
                builder.append(Character.toUpperCase(data));
            }
            else{
                builder.append(data);
            }
        }
        System.out.println(builder);
    }
}
