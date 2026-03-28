package patternProblem;

public class piramid {

    public static void main(String[] args) {
        int patternSize = 1;
        int n = 10;
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= patternSize; j++) {
                System.out.print("* ");
            }
            space--;
            patternSize += 2;
            System.out.println();
        }
    }
}
