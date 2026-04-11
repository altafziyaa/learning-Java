package numberQuestion;

public class prog8 {

    public static void main(String[] args) {
        System.out.println(countFactor(7));
    }

    public static int countFactor(int n) {
        // 
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;

    }

}
