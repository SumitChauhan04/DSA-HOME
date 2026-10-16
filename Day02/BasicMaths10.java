import java.util.Scanner;

public class BasicMaths10 {
  
    static boolean checkPerfectNumber(int num){
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a perfect number");
            return true;
        } else {
            System.out.println(num + " is not a perfect number");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkPerfectNumber(num);
    }
}
