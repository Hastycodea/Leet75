public class MaxVowels {
    public static void main(String[] args) {

        int result = maxVowels("leetcode", 3);

        System.out.println(result);
        
    }
    public static int maxVowels(String s, int k) {

        int window = 0;
        int result = 0;

        for(int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) window++;
        }

        result = window;

        for(int j = k; j < s.length(); j++) {
            if(isVowel(s.charAt(j))) window++;

            if(isVowel(s.charAt(j - k))) window--;

            result = Math.max(result, window);
        }

        return result;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
