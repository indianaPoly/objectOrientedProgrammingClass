package part3;
import java.util.Scanner;

public class problem04 {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    System.out.print("소문자 알파벳 하나를 입력하시오>>");
    String s = sc.next();
    char c = s.charAt(0);
    for (int i = (int)c + 1; i>97; i--) {
      for (int j=97; j<i; j++) {
        System.out.print((char)j);
      }
      System.out.println();
    }
  }
}
