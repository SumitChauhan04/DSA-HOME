

package Day03;

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;
        int x = (int) Math.sqrt(sum);

        System.out.println("Output: " + (x * x == sum ? x : -1));

        sc.close();
    }
}