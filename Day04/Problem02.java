//leetcode problem from quest (Q2. Factorial Trailing Zeroes

public class Problem02 {
   
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    public static void main(String[] args) {
        Problem02 solver = new Problem02();

      
        System.out.println("n = 3  -> Output: " + solver.trailingZeroes(3));  

        
        System.out.println("n = 5  -> Output: " + solver.trailingZeroes(5)); 

    }
}
