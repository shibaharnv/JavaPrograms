package javainterviewprograms.Arrays;

import java.util.*;

public class ArrayNeonCompanyDifference {

    public static String findPairs(int[] arr) {

 // {8, 3, 5, 2, 10, 4, 12};
        //{ take the first element as target that is arr[0] is target
        // // 1. addval=11,seen=3
        //   2.addval=13 seen=5
        //   3.addvalue:10 seen 2
        //   4.addvalue:18 seen 10
        //     12  :4
        //     12 :20}

        //{8,2, 10, 4, 12}
        // [2,10,4,12]

        //{a[0]-a[1]==target}
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
        int[] arr1 = {8, 3, 5, 2, 10, 4, 12};
        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Output: " + findPairs(arr1)); // Should print "5,2 -4,11"


    }
}
