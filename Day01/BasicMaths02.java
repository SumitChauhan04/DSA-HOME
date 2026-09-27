public class BasicMaths02 {
    static int CountDigits(int num){
        int Count=0;
        while(num!=0){
            num /= 10;
            Count++;
        }
        return Count;

    }
    public static void main(String[] args) {
        int num=276477;
        int ans =CountDigits(num);
        System.out.println(ans);
        
    }
    
}
