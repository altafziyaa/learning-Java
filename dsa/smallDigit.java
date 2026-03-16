package dsa;

public class smallDigit {
  public static void main(String[] args) {
    int num = 87342;
    int min = 9;

    while (num>0) {
      int digit = num % 10;
      if (digit<min) {
        min = digit;
      }
      num /= 10;
    }
    System.out.println(min);
  }
}
