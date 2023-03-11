package part3;
import java.util.Scanner;

public class problem06 {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
    System.out.print("금액을 입력하시오>>");
    int a = sc.nextInt();
    for (int i = 0; i< unit.length; i++) {
      if (a/unit[i] != 0) {
        System.out.println(unit[i]+"원 짜리 : "+ a/unit[i] + "개");
      }
      a = a % unit[i];
    }
  }
}
