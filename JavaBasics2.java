public class JavaBasics2 {
    
    public static void  print(){
        System.out.println("hello rakat");
        System.out.println("how are you ");
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    
    public static void calcsum(int a,int b){
        int sum=a+b;
        System.out.println("the sum is "+sum);
    }

    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static int bincoeff(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_n_r=factorial(n-r);
        return fact_n/(fact_r*fact_n_r);
    }
    public static void main(String[] args) {
        
        // print();
        // calcsum(5,6);
        // int result=multiply(7,7 );
        // System.out.println(result);
        // int factResult=factorial(5);
        // System.out.println(factResult);
        System.out.println(bincoeff(5,2));
    }
    
}
