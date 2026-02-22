package switchCase;

public class vowel {
  public static void main(String[] args) {
    char ch = 'a';
    switch (ch) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      System.out.println(ch +" vowel");
        break;

      default:
      System.out.println(ch+ " consonent");
        break;
    }
  }
}
