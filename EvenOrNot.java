public class EvenOrNot {

    public static boolean isEven(int n){
        boolean isEven=true;
        if(n%2==0){
            return false;
        }
        return true;

    }
    public static void main(String[] args) {

        System.out.println(isEven(12));
        
    }
    
}
