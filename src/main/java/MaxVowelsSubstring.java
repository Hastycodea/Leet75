public class MaxVowelsSubstring {
    public static void main(String[] args) {
        String name = "Briana";
//        System.out.println(name.substring(0,5));

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (isVowel(name.charAt(i))) {
                count++;
            }
        }
//        System.out.println(count);

        String s = "leetcode";
        int k = 3;

        System.out.println(maxVowelsSubstring(s, k));
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c =='o' || c =='u';
    }

    public static int maxVowelsSubstring(String word, int k) {
        int result = 0;
        int window = 0;

        for (int i = 0; i < k; i++) {
            if(isVowel(word.charAt(i))) window++;
        }

        result = window;

        for(int j = k; j < word.length(); j++) {
            if (isVowel(word.charAt(j))) window++;
            if(isVowel(word.charAt(j - k))) window--;
            result = Math.max(result, window);
        }


        return result;
    }

}
