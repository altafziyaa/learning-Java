package numberQuestion;

public class prog3 {

    public static void main(String[] args) {
        palindromeNum(123);
    }

    public static int palindromeNum(int n) {
        int num = n;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            // System.out.println(temp);
            num /= 10;
        }
        if (num == rev) {
            System.out.println("this is a palindrome num");
        } else {
            System.out.println("this is not a palindrome num");
        }
        return num;
    }
}
