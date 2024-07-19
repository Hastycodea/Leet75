public class ReverseString {
    public static String reverseString(String str) {
        String[] parts = str.trim().split(" ");
        String result = "";

        for (int i = parts.length - 1; i >= 0; i--) {
            if (parts[i].isEmpty()) {
                continue;
            }
            if (i == 0) {
                result += parts[i];
            }
            result += parts[i] + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Juju is  coming in   be   ready"));
    }
}
