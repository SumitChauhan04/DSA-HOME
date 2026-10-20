// leetcode  problem from quest (Count Primmes)
public class Problem01 {
    static int CountPrimes(int num){
        int Count=0;
        for(int i=2;i<num;i++){
            if(isPrime(i)){
                Count++;
            }
        }
        return Count;

    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int num=30;
        int ans =CountPrimes(num);
        System.out.println(ans);
        
    }
    
}