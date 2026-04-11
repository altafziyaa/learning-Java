package switchCase;

import java.util.Scanner;

public class elseifLadder {

    public static void main(String[] args) {
        System.out.println('0' + 0);
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        if ((x >= 65 && x <= 90) || (x >= 97 && x <= 122)) {
            System.out.println("Alphabet");
        } else if (x >= 48 && x <= 57) {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
    }
}
