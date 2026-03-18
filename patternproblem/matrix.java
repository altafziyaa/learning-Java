package patternproblem;

public class matrix {
  public static void main(String[] args) {
    int n = 4;
    getMatrix(n);
  }
  public static void getMatrix(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print("(" + i + "," + j + ") ");
      }
        System.out.println();
    }
  }
}
