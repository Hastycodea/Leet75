import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDifference {
    public static void main(String[] args) {
        int[] nums1 = {3, 5, 6, 6, 7, 9, 2, 1, 3};
        int[] nums2 = {3, 4, 6, 6, 0, 9, 7, 1, 3};

        var result = findDifference(nums1, nums2);

        System.out.println(result.toString());        
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();

        HashSet<Integer> hash1 = new HashSet<>();
        HashSet<Integer> hash2 = new HashSet<>();

        for(int i : nums1) {
            hash1.add(i);
        }

        for(int i : nums2) {
            hash2.add(i);
        }

        List<Integer> list1 = new ArrayList<>();
        for(int num : hash1) {
            if(!hash2.contains(num)) {
                list1.add(num);
            }
        }

        List<Integer> list2 = new ArrayList<>();
        for(int num : hash2) {
            if(!hash1.contains(num)) {
                list2.add(num);
            }
        }

        result.add(list1);
        result.add(list2);

        return result;
    }
}
