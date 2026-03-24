package dsa;

public class factorialNum {
  public static void main(String[] args) {
    int n = 12345;
    int fact=1;
    while (n > 0) {
      int digit = n % 10;
      fact *= digit;

      n /= 10;
    }
    System.out.println(fact);
  }
}
