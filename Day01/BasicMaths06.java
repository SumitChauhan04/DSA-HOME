/*
 ============================================================================
  Problem: LeetCode #7 - Reverse Integer
  Link: https://leetcode.com/problems/reverse-integer/
  Difficulty: Medium
  
  Goal: Given a 32-bit signed integer 'x', return 'x' with its digits reversed.
        If reversing 'x' causes the value to overflow 32-bit integer limits,
        return 0.

  Time Complexity: O(log10(N))
  Space Complexity: O(1)
 ============================================================================
*/

public class BasicMaths06 {

    public static int reverse(int x) {       
        long revNum = 0;       
        while (x != 0) {
            int digit = x % 10;            
            revNum = revNum * 10 + digit;  
            x = x / 10;                    
        }
        if (revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) revNum;
    }
        public static void main(String[] args) {
        
        int test1 = 123;
        int test2 = -123;
        int test3 = 1534236469; 

        System.out.println(test1); 
        System.out.println(test2);  
        System.out.println(test3); 
    }
}
