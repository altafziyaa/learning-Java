package patternProblem;

public class piramidSec {

    public static void main(String[] args) {
        int size = 1;
        int n = 11;
        int space = n - 1;

        for (int i = 1; i <= space; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }

            space--;
            size += 2;
            System.out.println();
        }
    }
}
