public class PrintSubArrays {

    public static void printSubArrays(int numbers[]){
        int n=numbers.length;
        int total_subarrays=0;
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i;j<n;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                total_subarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays = "+total_subarrays);
        
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubArrays(numbers);
        
    }
    
}
