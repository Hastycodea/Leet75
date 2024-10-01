import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 6, 5, 5 };
        System.out.println("Element 1 : " + majorityElement(nums));
        System.out.println("Element 2 : " + majorityElementTwo(nums));
        System.out.println("Element 3 : " + majorityElementThree(nums));

    }

    // first approach;

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (j == i)
                    break;
                if (num == nums[j])
                    count++;
            }
            map.put(num, count);
        }
        int max = 0;
        for (int val : map.values()) {
            if (val > max)
                max = val;
        }

        int result = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                result = entry.getKey();
            }
        }

        return result;
    }

    // second approach
    public static int majorityElementTwo(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int n = nums.length;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2)
                return entry.getKey();
        }

        return 0;
    }

    // third approach => Moore Voting Algorithm
    public static int majorityElementThree(int[] nums) {
        int count = 0;
        int candidate = 0;

        for(int num : nums) {
            if(count == 0) {
                candidate = num;
                count++;
            } 
            if(num == candidate) count++;
            if(num != candidate) count--;
        }
        return candidate;
    }
}
