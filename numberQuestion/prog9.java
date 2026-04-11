package numberQuestion;

public class prog9 {

    public static void main(String[] args) {
        System.out.println(perfectNum(6));
    }

    public static int perfectNum(int n) {
        int num = n;
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }

        }
        return sum;
    }

}
