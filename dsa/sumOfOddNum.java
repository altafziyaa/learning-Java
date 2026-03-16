package dsa;

public class sumOfOddNum {
  public static void main(String[] args) {

    int num = 345678;
    int sum = 0;

    while (num > 0) {
      int dig = num % 10;
      if (dig%2!=0) {
        sum = sum + dig;
      }
      num /= 10;
    }
    System.out.println(sum);
  }
}
