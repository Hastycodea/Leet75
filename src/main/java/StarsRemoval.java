import java.util.Stack;

public class StarsRemoval {
    public static void main(String[] args) {
        String word = "leet**cod*e";
        System.out.println(removeStars(word));
        
    }

    public static String removeStars(String word) {
        char[] wordArray = word.toCharArray();
        Stack<Character> result = new Stack<>();

        for(char c : wordArray) {
            if(!result.isEmpty() && c == '*') {
                result.pop();
            } else {
                result.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!result.isEmpty()) {
            sb.append(result.pop());
        }

        return sb.reverse().toString();

    }
}
