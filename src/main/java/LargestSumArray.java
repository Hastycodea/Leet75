public class LargestSumArray {
    public static void main(String[] args) {

        int[] numbers = {4, 5, 6, 14, 9, 0, 7};
        int k = 3;

        System.out.println(largestSumArray(numbers, k)); 
        
    }

    public static int largestSumArray(int[] numbers, int k) {
        
        int result = 0;
        int window = 0;

        for(int i = 0; i < k; i++) {
            window += numbers[i];
        }

        result = window;

        for(int j = k; j < numbers.length; j++) {
            window = result + numbers[j] - numbers[j - k];
            result = Math.max(result, window);
        }
        
        return result;
    }
}
