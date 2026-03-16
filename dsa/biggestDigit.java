package dsa;

public class biggestDigit {
  public static void main(String[] args) {
    int num = 8029345;
    int max = 0;
    while (num > 0) {
      int digit = num % 10;
      if (digit > max) {
        max=digit;
      }
      num /= 10;
    }
    System.out.println(max);
  }
}
