package javainterviewprograms.Arrays;

import java.util.*;

public class ArrayAddTwoNumbersToTarget {
    public static String ArrayChallenge(int[] arr) {
        int first = arr[0];
        Set<Integer> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < arr.length; i++) {
            int diff = first - arr[i];
            if (seen.contains(diff)) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(arr[i]).append(",").append(diff);
            }
            seen.add(arr[i]);
        }

        return result.length() > 0 ? result.toString() : "-1";
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 3, 5, 2, -4, 8, 11};
        int[] arr2 = {17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7};
        int[] arr3 = {7, 6, 4, 1, 7, -2, 3, 12};

        System.out.println(ArrayChallenge(arr1)); // Output: 5,2 -4,11
        System.out.println(ArrayChallenge(arr2)); // Output: 6,11 10,7 15,2
        System.out.println(ArrayChallenge(arr3)); // Output: 6,1 4,3
    }
}
