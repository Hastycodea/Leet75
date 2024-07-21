public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("Hellohayabusa"));
        
    }
    public static String reverseVowels(String word) {
        char[] wordArray = word.toCharArray();
        
        int start = 0;
        int end = word.length() - 1;

        String vowels = "aeiouAEIOU";

        while(start < end) {
            while (start < end && vowels.indexOf(wordArray[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(wordArray[end]) == -1) {
                end--;
            }

            //swapping
            char temp = wordArray[start];
            wordArray[start] = wordArray[end];
            wordArray[end] = temp;

            start++;
            end--;

        }

        String result = new String(wordArray);

        return result;
    }
}
