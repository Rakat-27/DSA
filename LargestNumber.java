public class LargestNumber {
    public static void main(String[] args) {
        int a=12;
        int b=23;
        int c=77;
        int largest;
        if(a>b && a>c){
            largest=a;
        }
        else if(b>a && b>c){
            largest=b;
        }
        else{
            largest=c;
        }
        System.out.println("Largest number: " + largest);
    }
}
