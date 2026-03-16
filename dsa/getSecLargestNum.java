package dsa;

public class getSecLargestNum {
  public static void main(String[] args) {
    int num = 34567;
    int lagest = 0;
    int second = 0;

    while (num > 0) {
      int dig = num % 10;
      if (dig > lagest) {
        second = lagest;
        lagest = dig;
      }
      if (dig > second && dig != lagest) {
        second = dig;
      }
      num /= 10;
    }
    System.out.println(second);
  }
}
