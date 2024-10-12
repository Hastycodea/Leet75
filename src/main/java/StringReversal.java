import java.util.*;

public class StringReversal {
  public static void main(String[] args) {

    String word = "maneno";
    System.out.println(stringReversal(word));
    
  }

  public static String stringReversal(String word) {

    StringBuilder result = new StringBuilder();

    for(int i = word.length() - 1; i >= 0; i--) {
      result.append(word.charAt(i));
    }
    return result.toString();
  }
}
