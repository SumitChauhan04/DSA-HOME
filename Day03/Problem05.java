//leetcode question (quest problem )   Permutation Sequence\

import java.util.ArrayList;

public class Problem05 {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        StringBuilder sb = new StringBuilder();
        k--; // Convert to zero-based index
        for (int i = n; i >= 1; i--) {
            int fact = factorial(i - 1);
            int index = k / fact;
            sb.append(nums.get(index));
            nums.remove(index);
            k %= fact;
        }
        return sb.toString();
    }

    private int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Problem05 solver = new Problem05();
        System.out.println(solver.getPermutation(3, 3));
    }
}