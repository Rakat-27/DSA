public class ReverseArray {

    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length - 1;
        while(first < last){
            // Swap elements
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        reverse(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
