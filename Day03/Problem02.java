// leetcode 2913. Subarrays Distinct Element Sum of Squares I

package Day03;
import java.util.*;
public class Problem02 {

    public static int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            Set<Integer> distinct = new HashSet<>();

            for (int j = i; j < n; j++) {
                distinct.add(nums.get(j));
                int count = distinct.size();
                totalSum += count * count;
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
      
        List<Integer> nums = Arrays.asList(1, 2, 1);
        System.out.println(sumCounts(nums));
    }
}
