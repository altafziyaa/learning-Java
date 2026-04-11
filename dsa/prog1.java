package dsa;

public class prog1 {

    void show() {
        System.out.println("this non static method ");
    }

    public static void main(String[] args) {
        prog1 obj = new prog1();
        obj.show();
    }
}
