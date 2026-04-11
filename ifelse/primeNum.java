package ifelse;

import java.util.Scanner;

public class primeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num :");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("this is psitive num");
        } else if (n < 0) {
            System.out.println("this negative num");
        } else {
            System.out.println("this num is 0");
        }

    }
}
