// leetcode problem 15 3sum
import java.util.*;

public class Problem06 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        Problem06 solver = new Problem06();

    
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Output 1: " + solver.threeSum(nums1));

      
    }
}
