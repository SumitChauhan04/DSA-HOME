
public class BasicMaths08 {
    static int getGCD(int a, int b) {
        while (b != 0) {
            int oldvalueOfb = b;
            b = a % b;
            a = oldvalueOfb;
        }
        return a;
    }

    static int getLCM(int a, int b) {
        int gcd = getGCD(a, b);
        int prod = a * b;
        int lcm = prod / gcd;
        return lcm;
    }

    public static void main(String[] args) {
        System.out.println(getGCD(12, 18));
        System.out.println(getLCM(12, 18));
    }
}
    

//GCD OF A NUMBER
