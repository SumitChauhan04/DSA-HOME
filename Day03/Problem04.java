public class Problem04 {

    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;

        int rem = 0;
        for (int len = 1; len <= k; len++) {
            rem = (rem * 10 + 1) % k;
            if (rem == 0) return len;
        }

        return -1;
    }

    public static void main(String[] args) {
        Problem04 solver = new Problem04();

        System.out.println(solver.smallestRepunitDivByK(1)); 
        System.out.println(solver.smallestRepunitDivByK(2)); 
        System.out.println(solver.smallestRepunitDivByK(3)); 
        System.out.println(solver.smallestRepunitDivByK(7)); 
    }
}


