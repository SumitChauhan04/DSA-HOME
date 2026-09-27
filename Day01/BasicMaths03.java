public class BasicMaths03 {
    static int SumofDigits(int num){
        int sum=0;
        while(num!=0){
            int digits=num%10;
            sum=sum+digits;
            num=num/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        int num=3466;
        int sum=SumofDigits( num);
        System.out.println(sum);
        
    }
    
}
