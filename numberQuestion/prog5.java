package numberQuestion;

public class prog5 {

    public static void main(String[] args) {
        isArmstrongNum(153);
    }

    public static void isArmstrongNum(int n) {
        int sum = 0;
        for (int num = n; num > 0; num /= 10) {
            int digit = num % 10;
            sum += (digit * digit * digit);
        }
        if (n == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
