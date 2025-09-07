public class MaxSubArraySum2 {

    public static void printSubArrays(int arr[]){
        int n=arr.length;
        for(int start=0;start<n;start++){
            for(int end=start;end<n;end++){
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void maxSubArraySum(int arr[]){
        int max_sum=Integer.MIN_VALUE;
        int n=arr.length;
        int curr_sum=0;
        for(int start=0;start<n;start++){
            for(int end=start;end<n;end++){
                curr_sum=0;
                for(int k=start;k<=end;k++){
                    curr_sum+=arr[k];
                }
                if(curr_sum>max_sum){
                    max_sum=curr_sum;
                }
            }
        }
        System.out.println("Max Sub Array Sum is: "+max_sum);
        
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int n=arr.length;
        // printSubArrays(arr);
        maxSubArraySum(arr);
        
    }
}
