package nestedif;

import java.util.Scanner;

public class 

     switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("this is even +ve num");
            } else {
                System.out.println("this is odd +ve num");
            }
        } else {
            System.out.println("this is negatiev num");
        }
    }
}
