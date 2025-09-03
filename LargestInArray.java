public class LargestInArray {

     public static int Largest(int numbers[]){
            int largest = numbers[0];
            for(int i = 1; i < numbers.length; i++){
                if(largest < numbers[i]){
                    largest = numbers[i];
                }
            }
            return largest;
     }

     public static int Smallest(int numbers[]){
            int smallest = numbers[0];
            for(int i = 1; i < numbers.length; i++){
                if(smallest> numbers[i]){
                    smallest = numbers[i];
                }
            }
            return smallest;
     }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int largest = Largest(numbers);
        int smallest = Smallest(numbers);
        System.out.println("Smallest number in array: " + smallest);
        System.out.println("Largest number in array: " + largest);
    }
    
}
