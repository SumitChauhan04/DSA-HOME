/*
 * Problem: LeetCode #258 - Add Digits
 * Link: https://leetcode.com/problems/add-digits/
 * Difficulty: Easy
 * 
 * Approach:
 * Repeatedly add all digits of the number until the result has only 1 digit.
 * - Outer loop runs until number becomes single digit (num < 10).
 * - Inner loop extracts digits using (%) and removes last digit using (/).
 * 
 * Time Complexity: O(log10(N))
 * Space Complexity: O(1)
 */

public class BasicMaths04 {
   
//
    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            
            while (num != 0) {
                int digits = num % 10;
                sum = sum + digits;
                num = num / 10;
            }
            
            num = sum;
        }
        
        return num;
    }

   
    public static void main(String[] args) {
        int input = 38;
        int result = addDigits(input);
        
        System.out.println(input);
        System.out.println( result);
    }
}