public class MyAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("     -43ds"));
    }

    public static int myAtoi(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        s = s.trim();
        if(s.isEmpty()) {
            return 0;
        }

        int index = 0;
        int sign = 1;
        if(s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = (s.charAt(index) == '+') ? 1 : -1;
            index++;
        }

        long result = 0;
        while(index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');
            index++;

            if(result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int) result * sign;

    }
}
