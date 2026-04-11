package numberQuestion;

public class prog4 {

    public static void main(String[] args) {
        armstrongNum(379);
    }

    public static int armstrongNum(int n) {
        int num = n;
        int sum = 0;

        while (num > 0) {

            int digit = num % 10;
            sum = sum + (digit * digit * digit);

            num /= 10;
        }
        if (n == sum) {
            System.out.println("this is armstrong num");
        } else {
            System.out.println("this is not armstrong num");
        }
        return sum;
    }
}
