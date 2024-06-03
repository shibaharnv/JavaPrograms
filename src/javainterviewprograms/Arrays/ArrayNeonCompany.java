package javainterviewprograms.Arrays;
import java.util.*;
public class ArrayNeonCompany {

    public static String findPairs(int[] arr) {
        if (arr == null || arr.length < 3) {
            return "-1"; // If array length is less than 3, no valid pairs can exist
        }

        int target = arr[0];
        Set<Integer> seenNumbers = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            int complement = target - num;

            if (seenNumbers.contains(complement)) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(complement).append(",").append(num);
            }

            seenNumbers.add(num);
        }

        return result.isEmpty() ? "-1" : result.toString();
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 3, 5, 2, -4, 8, 11};
        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Output: " + findPairs(arr1)); // Should print "5,2 -4,11"

//        int[] arr2 = {17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7};
//        System.out.println("Input: " + Arrays.toString(arr2));
//        System.out.println("Output: " + findPairs(arr2)); // Should print "6,11 10,7 15,2"
//
//        int[] arr3 = {7, 6, 4, 1, 7, -2, 3, 12};
//        System.out.println("Input: " + Arrays.toString(arr3));
//        System.out.println("Output: " + findPairs(arr3)); // Should print "6,1 4,3"
    }
}
