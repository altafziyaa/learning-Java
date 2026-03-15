package ifelse;
public class upperAndLowerCase {
 public static void main(String[] args) {
   char ch = 'a';

   if (ch >= 'A' && ch <= 'Z') {
     System.out.println("uppercase");
   }
  else if (ch>='a'&& ch<='z') {
    System.out.println("lowercase");
  }
 }

}
