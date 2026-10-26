//leetcode quests problem Numbers of 1 bits
package Day05;
public class Problem02 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1; // Increment count if the least significant bit is 1
            n >>>= 1;       // Unsigned right shift to process the next bit
        }
        return count;
    }
}
