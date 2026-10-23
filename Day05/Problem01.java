



//  //leetcode3644. Maximum K to Sort a Permutation
package Day05;

import java.util.Scanner;

public class Problem01 {

    public static int sortPermutation(int[] nums) {
        int result = -1; // -1 means: "haven't seen any wrong number yet"

        for (int i = 0; i < nums.length; i++) {
            // Is this number in the wrong position?
            if (nums[i] != i) {
                if (result == -1) {
                    result = nums[i];          // Grab the first wrong number
                } else {
                    result = result & nums[i];  // AND it with the next wrong number
                }
            }
        }

        // If result is still -1, the array was already sorted
        if (result == -1) {
            return 0;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read size
        int n = sc.nextInt();

        // 2. Read array
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // 3. Print answer
        System.out.println(sortPermutation(nums));

        sc.close();
    }
}