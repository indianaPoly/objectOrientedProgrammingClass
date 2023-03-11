package part3;
import java.util.Scanner;

public class problem03 {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력하시오>>");
    int a = sc.nextInt();
    // for의 가운데 조건식은 멈출 때 사용하는게 아니라 i의 값이 만족할 때 작동하는 것임
    for(int i = a+1; i>1; i--) {
      for(int j = 1; j<i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
