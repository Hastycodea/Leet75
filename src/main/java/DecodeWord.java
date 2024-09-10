import java.util.Stack;

public class DecodeWord {
    public static void main(String[] args) {
        String s = "2[xb]1[a]";
        System.out.println(decodeWord(s));
        
    }

    public static String decodeWord(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> sbStack = new Stack<>();

        int k = 0;
        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = 10 * k + (c - '0');                
            } else if (c == '[') {
                numStack.push(k);
                sbStack.push(result);

                k=0;
                result = new StringBuilder();

            } else if(c == ']') {
                int repeat = numStack.pop();
                StringBuilder sb = sbStack.pop();

                for(int i = 0; i < repeat; i++) {
                    sb.append(result);
                }

                result = sb;

            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
