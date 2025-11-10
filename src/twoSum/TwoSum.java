package twoSum;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int[] result1 = twoSum(nums1, 9);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]"); // [0, 1]
    }
}

