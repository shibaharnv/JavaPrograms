package javainterviewprograms.Arrays;

import java.util.*;

public class ArrayDifference {

    public static String findPairsWithDifference(int[] arr) {
        if (arr == null || arr.length < 2) {
            return "-1"; // If array is empty or has fewer than 2 elements, return -1
        }

        int target = arr[0];
        Map<Integer, Integer> numMap = new HashMap<>();
        List<String> pairs = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int diff = Math.abs(target - current);

            if (numMap.containsKey(diff)) {
                // Retrieve the corresponding number that forms a pair with 'current'
                int matchingNum = numMap.get(diff);
                pairs.add(matchingNum + "," + current);
            }

            // Store the current number in the map
            numMap.put(current, current);
        }

        if (pairs.isEmpty()) {
            return "-1"; // No valid pairs found
        } else {
            return String.join(" ", pairs); // Join pairs with space and return as string
        }
    }

    public static void main(String[] args) {
        // Test the findPairsWithDifference function
        int[] arr1 = {8, 3, 5, 2, 10, 4, 12};
        int[] arr2 = {10, 2, 6, 1, 7, 9};

        System.out.println("Result for arr1: " + findPairsWithDifference(arr1)); // Should output "3,5 2,10 4,12"
        System.out.println("Result for arr2: " + findPairsWithDifference(arr2)); // Should output "-1" (no valid pairs)
    }
}
