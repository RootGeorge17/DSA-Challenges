import java.util.HashMap;
import java.util.Map;


public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        Map<Integer, Integer> numToIndex = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to reach the target
            int complement = target - nums[i];
            // Check if the complement exists in the HashMap
            if (numToIndex.containsKey(complement)) {
                // If found, return the indices of the two numbers that sum to the target
                return new int[] {numToIndex.get(complement), i};
            }
            // If the complement doesn't exist, add the current number to the HashMap with its index
            numToIndex.put(nums[i], i);
        }
        // If no solution is found, return an empty array
        return new int[] {};
    }
}

