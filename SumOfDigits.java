public class SumOfDigits {

    public static int sumOfdigits(int n){
        int sum=0;
        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {

        int result=sumOfdigits(1234);
        System.out.println(result);
        
    }
    
}
