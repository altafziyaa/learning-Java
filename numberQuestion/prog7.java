package numberQuestion;

public class prog7 {

    public static void main(String[] args) {
        int num = 12345;
        int fact = 1;

        while (num > 0) {
            int digit = num % 10;
            fact *= digit;

            num /= 10;
        }
        System.out.println(fact);
    }

}
