public class GreatestCommonDivisor {
    public static String greatestCommonDivisor(String a, String b) {
        if (!(a + b).equals(b + a) ||(a + b).isEmpty()){
            return "";
        }
        int gcd = gcd(a.length(), b.length());
        return  a.substring(0, gcd);
    }
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        String a = "ABCABCABCABC";
        String b = "ABCABC";
        String result = greatestCommonDivisor(a, b);
        System.out.println(result);
    }
}
