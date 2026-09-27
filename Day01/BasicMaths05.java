public class BasicMaths05 {

    static int revNum(int num){
        int reversed = 0;   // starting =0
        while(num!=0){ //1234>10 true 
            int digits= num%10;// here we do 1234%10 we got 4
            reversed = reversed * 10 + digits;// here we use formula=0*10+4=4
           num=num/10;// here we 123 because 4 is remove by this line

        }
        return reversed;
    }
    public static void main(String[] args) {
        int num=1234;
        int revNum=revNum( num);
        System.out.println(revNum);
    }
}


