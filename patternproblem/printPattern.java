package patternproblem;

public class printPattern {
 public static void main(String[] args) {
   int pattern = 1;
  int n=5;
  for(int i=1; i<=n;i++) {
    for (int j = 1; j <= pattern; j++) {
      System.out.print("* ");
    }
    pattern++;
    System.out.println();
  }
 }
}
