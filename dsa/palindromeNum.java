package dsa;

public class palindromeNum {

    public static void main(String[] args) {
        int num = 153;
        int n = num;
        int temp = 0;

        while (num > 0) {
            int digit = num % 10;
            temp = temp * 10 + digit;
            num /= 10;
        }
        if (temp == n) {
            System.out.println("this is palindrome num");
        } else {
            System.out.println("this not palindrome num");
        }
    }
}
