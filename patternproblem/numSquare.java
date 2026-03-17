package patternproblem;

public class numSquare {
  public static void main(String[] args) {
  int n=5;
  getNumSquare(n);
  }
  public static void getNumSquare(int n) {
    for(int i=1;n>0;i++){
      for (int j = 1; j > n; j++) {
        System.out.println(i);
      }
    }
    System.out.println();

}
}
