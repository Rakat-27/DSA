public class MaxSubArraySum {

    public static int maxSubArraySum(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum > max_sum){
                    max_sum = sum;
                }
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = {-2, 3, 5, 6, -19, 7, 8};
        int result = maxSubArraySum(arr);
        System.out.println("Maximum subarray sum is: " + result);
    }
}
