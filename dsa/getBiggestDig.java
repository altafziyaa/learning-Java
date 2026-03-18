package dsa;

public class getBiggestDig {
  public static void main(String[] args) {
    int n = 7654921;
    int biggest = 0;

    while (n > 0) {
      int rem = n % 10;
      if (rem > biggest) {
        biggest = rem;
      }
      n /= 10;
    }
    System.out.println(biggest);
  }

}



