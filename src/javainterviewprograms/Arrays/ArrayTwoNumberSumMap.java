package javainterviewprograms.Arrays;



import java.util.HashMap;
import java.util.Map;

public class ArrayTwoNumberSumMap {

    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // Return {-1, -1} if no such pair is found
    }

    public static void main(String[] args) {
        //int[] nums = {2, 7, 11, 15};
        int[] nums = {1,2, 3};
        int target = 3;

        int[] result = findTwoSum(nums, target);

        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Two elements found at indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No such elements found.");
        }
    }
}
