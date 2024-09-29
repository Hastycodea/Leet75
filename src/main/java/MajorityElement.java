import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
        
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for(int i = 0; i < n; i++) {
            int num = nums[i];
            int count = 1;
            for(int j = 0; j < n; j++) {
                if(j == i) break;
                if(num == nums[j]) count++;
            }
            map.put(num, count);
        }
        int max = 0;
        for(int val : map.values()) {
            if(val > max) max = val;
        }

        int result = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue().equals(max)) {
                result = entry.getKey();
            }
        }

        return result;
    }
}
