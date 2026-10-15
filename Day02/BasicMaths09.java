
    
public class BasicMaths09 {

    static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit; 6
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number");
            return true;
        } else {
            System.out.println(originalNum + " is not an Armstrong number");
            return false;
        }
    }

  
    public static void main(String[] args) {
        isArmstrong(153); 
        isArmstrong(123); 
    }
}
