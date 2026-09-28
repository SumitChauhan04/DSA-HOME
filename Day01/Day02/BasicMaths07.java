
public class BasicMaths07 {
    static int reverseNum(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse;
    }

    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverseNum = reverseNum(num);
        if (originalNum == reverseNum) {
            System.out.println("it is palindrome");
            return true;
        } else {
            System.out.println("it is not a palindrome");
            return false;
        }
    }

    public static void main(String[] args) {
        boolean ans = isPalindrome(1221);
        System.out.println(ans);
    }
}