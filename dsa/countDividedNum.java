package dsa;

public class countDividedNum {
  public static void main(String[] args) {
    countDivided(12345);
  }

  public static int countDivided(int n){

    int count = 0;
    int temp = n;
    while (n > 0) {
      int rem = n % 10;
      if (temp % rem == 0) {
        count++;
      }
      n/=10;
    }
    return count;
  }

}
