import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrences {

    public static void main(String[] args) {
        
        int[] arr = {};
        boolean result = uniqueOccurrences(arr);
        System.out.println(result);
        
    }

    public static boolean uniqueOccurrences(int[] arr) {

        if(arr.length == 0) {
            return false;
        }

        HashMap<Integer, Integer> countOccurences = new HashMap<>();

        for(int i : arr) {
            countOccurences.put(i, countOccurences.getOrDefault(i, 0) + 1);
        }

        HashSet<Integer> hashSet = new HashSet<>(countOccurences.values());

        return countOccurences.size() == hashSet.size();
    }
    
}
