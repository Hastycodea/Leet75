import java.util.Stack;

public class RemoveStars {
    public static void main(String[] args) {
        String name = "lee**tco*de*";
        System.out.println(removeStars(name));
    }

    public static String removeStars(String word) {

        Stack<Character> wordStack = new Stack<>();
        
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == '*') {
                if(!wordStack.isEmpty()) {
                    wordStack.pop();
                } 
            } else {
                wordStack.add(word.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!wordStack.isEmpty()) {
            sb.append(wordStack.pop());
        }

        return sb.reverse().toString();

    }
}
