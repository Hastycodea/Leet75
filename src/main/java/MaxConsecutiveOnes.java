public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 1, 0, 0, 1, 1, 0, 1};

        System.out.println(maxOnes(numbers, 2));
        
    }

    public static int maxOnes(int[] nums, int k) {
        int j = 0;
        int i = 0;

        for(j = 0; j < nums.length; j++) {
            if(nums[j] == 0) k--;
            if(k < 0 && nums[i++] == 0) k++;
        }

        return j - i;
    }
}
