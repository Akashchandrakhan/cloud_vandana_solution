1.JAVA :
(A) Create an array with the values (1,2,3,4,5,6,7) and shuffle it 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an ArrayList with the values (1, 2, 3, 4, 5, 6, 7)
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        // Shuffle the ArrayList
        Collections.shuffle(list);

        // Convert the shuffled ArrayList back to an array
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Print the shuffled array
        for (int i : shuffledArray) {
            System.out.print(i + " ");
        }
    }
}
===========================================================
(B) 
Enter a Roman Number as input and convert it to an integer. (ex IX = 9) 
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanToIntegerMap = new HashMap<>();
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanToIntegerMap.get(s.charAt(i));

            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }

            prevValue = curValue;
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX";
        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println("The integer equivalent of " + romanNumeral + " is: " + integerEquivalent);
    }
}
=============================================================================
(C)
Check if the input is pangram or not. (Pangram is a sentence that contain all the alphabet from a-z)
public class PangramChecker {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();  // Convert the input string to lowercase for case-insensitive comparison.
        boolean[] alphabet = new boolean[26];  // Create an array to track the presence of each letter.

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are present in the input.
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}