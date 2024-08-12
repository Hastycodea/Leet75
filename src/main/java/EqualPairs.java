import java.util.Arrays;

public class EqualPairs {

    public static void main(String[] args) {

        int[][] grid = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        System.out.println(equalPairs(grid));
        
    }

    public static int equalPairs(int[][] grid) {

        int n = grid.length;

        int[][] transposedGrid = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                transposedGrid[j][i] = grid[i][j];
            }
        }

        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j=0; j<n; j++) {
                if(Arrays.equals(grid[i], transposedGrid[j])) {
                    count++;
                }
            }
        }

        return count;
    }
    
}
