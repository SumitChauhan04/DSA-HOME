import java.util.Scanner;

public class BasicMaths10 {
  
    static boolean checkPerfectNumber(int num) {
        // Perfect number hamesha 1 se bada positive integer hota hai
        if (num <= 1) {
            System.out.println(num + " is not a perfect number");
            return false;
        }

        int sum = 0;
        
        // 1 se num / 2 tak ke saare divisors ka sum nikal rahe hain
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Agar divisors ka sum number ke barabar hai toh Perfect Number hai
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
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        checkPerfectNumber(num);
        
        sc.close();
    }
}