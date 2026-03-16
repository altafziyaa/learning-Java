package dsa;

public class countEvenDigit {
 public static void main(String[] args) {
   int num = 234567;
   int count = 0;
  while (num>0) {
    int dig = num % 10;
    if (dig % 2 == 0) {
      count++;
    }
    num /= 10;
  }
  System.out.println(count);
 }
}
