import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CloseStrings {
    public static void main(String[] args) {

        String one = "cabbba";
        String two = "abbccc";

        System.out.println(closeStrings(one, two));
        // closeStrings(one, two);
        
    }
    public static boolean closeStrings(String word1, String word2) {
        int[] charOne = new int[26];       
        int[] charTwo = new int[26]; 

        Set<Character> hash1 = new HashSet<>();
        Set<Character> hash2 = new HashSet<>();
        
        for(char c : word1.toCharArray()) {
            charOne[c - 'a']++;
            hash1.add(c);
        }

        for(char c : word2.toCharArray()) {
            charTwo[c - 'a']++;
            hash2.add(c);
        }

        Arrays.sort(charOne);
        Arrays.sort(charTwo);

        // System.out.println(charOne.length);
        // System.out.println();

        // for(int c : charOne) {
        //     System.out.println(c);
        // }
        return Arrays.equals(charOne, charTwo) && hash1.equals(hash2);        
    }
}
