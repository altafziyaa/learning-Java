package patternproblem;

public class first {
  public static void main(String[] args) {
    int n = 5;
    getSquarepattern(n);
   }
   public static void getSquarepattern(int n) {

     for (int i = 1; i <= n; i++) {
       for (int j = 1; j <= n; j++) {
         System.out.print("*  ");
       }
      System.out.println();
    }
}
}
