public class LongestSubArray {

    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSub(nums));        
    }

    public static int longestSub(int[] nums) {
        
        int i = 0, j=0, max=0, pos=0;

        while(pos < nums.length) {
            if(nums[pos] == 1) {
                pos++;
                i++;

            } else if(nums[pos] == 0) {
                pos++;
                j = 0;


                while (pos < nums.length && nums[pos] == 1) {
                    pos++;
                    j++;
                }

                max = Math.max(max, j + i);
                i = j;
            }
        }

        if (i == nums.length) {
            max = nums.length - 1; 
            
        }
        return max;
    }
    
}
