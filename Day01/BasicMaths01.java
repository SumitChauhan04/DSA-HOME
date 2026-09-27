

public class BasicMaths01 {

    static void printDigits(int num) {
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }

    public static void main(String[] args) {
        int num = 2357;
        printDigits(num);
    }
}
