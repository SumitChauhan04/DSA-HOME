public class BasicMaths09 {
    static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        if (sum == originalNum) {
            System.out.println("it is armstrong");
            return true;
        } else {
            System.out.println("it is not armstrong");
            return false;
        }
    }

    
}
