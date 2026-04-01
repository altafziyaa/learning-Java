package patternProblem;

public class prog5 {

    public static void A() {
        System.out.println("this is first static method ");
    }

    public void B() {
        A();
        System.out.println("this is second non-static method");
    }

    public static void main(String[] args) {
        // B();
        prog5 obj = new prog5();
        obj.B();
    }
}
