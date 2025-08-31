public class PalindromeCheck {

    public static void palindromeCheck(int n){
        int temp=n;
        int reverseNum=0;
        while(n>0){
            reverseNum = reverseNum * 10 + (n % 10);
            n = n / 10;
        }
        if(temp==reverseNum){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
         
    }

    public static void main(String[] args) {

        palindromeCheck(10111);
        
    }
    
}
