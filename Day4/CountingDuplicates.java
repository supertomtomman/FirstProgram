package Day4;

/*
Count the number of Duplicates

        Write a function that will return the count of distinct
        case-insensitive alphabetic characters and numeric digits
        that occur more than once in the input string.
        The input string can be assumed to contain only alphabets
        (both uppercase and lowercase) and numeric digits.
        Example

        "abcde" -> 0 # no characters repeats more than once
        "aabbcde" -> 2 # 'a' and 'b'
        "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (bandB)
        "indivisibility" -> 1 # 'i' occurs six times
        "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
        "aA11" -> 2 # 'a' and '1'
        "ABBA" -> 2 # 'A' and 'B' each occur twice
*/


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {

    public static void main(String[] args) {
        System.out.println("Relevant number of duplicates: "
                +duplicateCount("ABBA"));
    }

    public static int duplicateCount(String text) {

        ArrayList<Character> allduplicates = new ArrayList<>();


        for (int i = 0; i < text.length(); i++) {

            char c = Character.toUpperCase(text.charAt(i));
            if (isThereDuplicate(c, text.toUpperCase())) {
                allduplicates.add(c);
            }

        }

        return numberOfRelevantDuplicates(allduplicates);
        // Write your code here
    }

    private static int numberOfRelevantDuplicates(ArrayList<Character> allduplicates) {
        Set<Character> selectedDuplicates = new HashSet<Character>();
        for (Character element : allduplicates) {
            selectedDuplicates.add(element);

        }
        return selectedDuplicates.size();
    }

    private static boolean isThereDuplicate(char c, String s) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                counter++;

            }
        }
        return counter > 1 ? true : false;
    }
}
