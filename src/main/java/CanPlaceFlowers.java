public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 1, 0, 1};
        System.out.println(canPlaceFlowers(numbers, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerBed, int n) {
        int count = 0;
        for(int i = 0; i < flowerBed.length; i++) {
            if (flowerBed[i] == 0 && (i == 0 || flowerBed[i-1] == 0) && (i == flowerBed.length - 1 || flowerBed[i+1] == 0)) {
                count++;                
            }
            if (count == n) {
                return true;                
            }
            i++;
        }
        return false;
    }

}
