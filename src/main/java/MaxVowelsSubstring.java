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
        int j = 0;

        while(j <= word.length() - k) {
            String subWord = word.substring(j, k + j);

            int vowelCount = 0;
            for (int i = 0; i < k; i++) {
                if(isVowel(subWord.charAt(i))) {
                    vowelCount++;
                }
            }

            result = Math.max(result, vowelCount);
        }
        return result;
    }

}
