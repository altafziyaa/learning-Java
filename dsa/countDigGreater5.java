package dsa;

public class countDigGreater5 {
  public static void main(String[] args) {
    int num = 4679123;
    int count = 0;

    while (num > 0) {
      int dig = num % 10;
      if (dig > 5) {
        count++;
      }
      num /= 10;
    }
    System.out.println(count);
  }
}
