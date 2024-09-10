public class DiagonalDifference {

    public static void main(String[] args) {
        
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
            };
        
        
        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(int[][] arr) {
        
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < arr.length; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length - 1 - i];

            
        }

        int result = Math.abs(sum1 - sum2);

        return result;
    }
    
}
