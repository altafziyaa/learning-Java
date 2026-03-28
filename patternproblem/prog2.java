package patternProblem;

public class prog2 {

    public static void main(String[] args) {
        printPascalRow(5);
    }

    public static void printPascalRow(int n) {
        int comb = 1;

        System.out.print(comb + " ");
        for (int i = 0; i < n; i++) {
            comb = comb * (n - 1) / (i / 1);
            System.out.println();
        }
    }
}
