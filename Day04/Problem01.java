// leetcode  problem from quest (Count Primmes)
import java.util.Arrays;

public class Problem01 {

    static int countPrimes(int num) {
        if (num <= 2) return 0;

        boolean[] isPrime = new boolean[num];
        Arrays.fill(isPrime, true);
        
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < num; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < num; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < num; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int num = 30;
        int ans = countPrimes(num);
        System.out.println(ans);
    }
}