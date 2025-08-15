package practice;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String input = "IIV";
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('V', 5);
        map.put('I', 1);

        int prevValue = 0; // To store the value of the previous character

        // Iterate from right to left
        for (int i = input.length() - 1; i >= 0; i--) {
            int currentValue = map.get(input.charAt(i));

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                // Otherwise, add it
                result += currentValue;
            }

            // Update the previous value for the next iteration
            prevValue = currentValue;
        }

        System.out.println(result); // Expected output: 4
    }
}