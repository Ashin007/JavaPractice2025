package interviewquestios.techwithjathin;

import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String[] args) {

        String input = "((())))";
        char[] chaArray = input.toCharArray();

        Stack<Character> characterStack = new Stack<>();

        for(char character: chaArray){
            if(character=='('){
                characterStack.push(character);
            }
            if(character==')'){
                if(characterStack.isEmpty())
                    System.out.println("False");
                else{
                    characterStack.pop();
                }
            }


        }
        System.out.println(characterStack);
        System.out.println(characterStack.isEmpty());
    }
}
