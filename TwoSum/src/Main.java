public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        // Test 1
        int[] nums1 = {2, 7, 11, 15};
        int[] result1 = twoSum.twoSum(nums1, 9);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");

        // Test 2
        int[] nums2 = {3, 2, 4};
        int[] result2 = twoSum.twoSum(nums2, 6);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");

        // Test 3
        int[] nums3 = {3, 3};
        int[] result3 = twoSum.twoSum(nums3, 6);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
    }
}