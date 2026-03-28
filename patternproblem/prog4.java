package patternProblem;

public class prog4 {

    static void varArgMethod(int... num) {
        int total = 0;
        for (int n : num) {
            total += n;
            System.out.println(total);
        }
    }

    public static void main(String[] args) {
        varArgMethod(1, 2, 3);
        varArgMethod(1, 2, 3, 4);
    }
}
