package javainterviewprograms.Strings;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static String longestSubstringWithoutRepeatingChars(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        int n = s.length();
        int maxLength = 0;
        int start = 0;
        int end = 0;
        Set<Character> seen = new HashSet<>();
        String longestSubstring = "";

        while (end < n) {
            char currentChar = s.charAt(end);
            if (!seen.contains(currentChar)) {
                seen.add(currentChar);
                end++;
                if (end - start > maxLength) {
                    maxLength = end - start;
                    longestSubstring = s.substring(start, end);
                }
            } else {
                seen.remove(s.charAt(start));
                start++;
            }
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        String input = "abae";

        String subString=input.substring(0,3);
        System.out.println(subString);
        String longestSubstring = longestSubstringWithoutRepeatingChars(input);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }
}
