package nestedif;

import java.util.Scanner;

public class checkChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        if (x >= 'A' && x <= 'Z' || x >= 'a' && x <= 'z') {
            if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U' || x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                System.out.println("this vowels character");
            } else {
                System.out.println("this is consonant");
            }
        } else {
            System.out.println("Not alphabet");
        }

    }
}
