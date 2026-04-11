package switchCase;

public class getoneToten {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println(" a is " + a + " and b is " + b + " this is before execution");

        int temp = a;
        a = b;
        b = temp;
        System.out.println(" a is " + a + " and b is " + b + " this is after execution");

    }
}
