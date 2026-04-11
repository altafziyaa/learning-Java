package nestedif;

import java.util.Scanner;

public class switchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n) {
            case 2:
                System.out.println("2 day is monday");
            // break;
            case 3:
                System.out.println("3 day is tuesday");
            // break;
            case 4:
                System.out.println("4 day is wednesday");
            // break;
            case 5:
                System.out.println("5 day is thursday");
            // break;
            case 6:
                System.out.println("6 day is friday");
            // break;
            case 7:
                System.out.println("7 day is sunday");
            // break;
            default:
                System.out.println("not a day");
                ;
        }
    }
}
