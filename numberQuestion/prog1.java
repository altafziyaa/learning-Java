package numberQuestion;

public class prog1 {

    public static void main(String[] args) {

        System.out.println(sumOfDigit(123));
    }

    public static int sumOfDigit(int n) {
        int num = n;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num /= 10;
        }
        return sum;
    }

}
