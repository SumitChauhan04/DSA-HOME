package Day05;

public class Problem03 {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either add nums[i] to existing subarray or start new subarray at nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Update global maximum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Problem03 sol = new Problem03();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + sol.maxSubArray(nums)); // Output: 6
    }
}