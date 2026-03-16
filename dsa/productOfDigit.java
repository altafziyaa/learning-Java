package dsa;

public class productOfDigit {
  public static void main(String[] args) {
    int num = 567;
    int product = 1;
    while (num>0) {
      int digit = num % 10;
      product = product * digit;
      num /= 10;
    }
    System.out.println(product);
  }
}
