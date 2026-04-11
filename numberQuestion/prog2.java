package numberQuestion;

public class prog2 {

    public static void main(String[] args) {
        System.out.println(reverseNum(12034));
    }

    public static int reverseNum(int n) {
        int num = n;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            // System.out.println(rev);

            num /= 10;
        }
        return rev;

    }

}
