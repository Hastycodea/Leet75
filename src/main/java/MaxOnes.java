public class MaxOnes {
    public static void main(String[] args) {

        int[] numbers = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(maxOnes(numbers, 2));

    }

    public static int maxOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int n = nums.length;

        while(i < n) {
            if(nums[i] == 0) k--;
            if(k < 0) {
                if(nums[j] == 0) k++;
                j++;
            }
            i++;
        }

        return i - j;
    }
}
