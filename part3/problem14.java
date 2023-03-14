package part3;
import java.util.Scanner;

public class problem14 {
  public static void main(String[] arg) {
    String[] course = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
    int[] score = {95, 88, 76, 62, 55};
    Scanner sc = new Scanner(System.in);
    System.out.print("과목 이름>>");
    String name = sc.nextLine();
    boolean isOk = false;

    for (int i=0; i<course.length; i++) {
      if(course[i].equals(name)) {
        isOk = true;
        System.out.println(course[i] + "의 점수는 " + score[i]);
        break;
      }
    }
    if (!isOk) {
      System.out.println("없는 과목입니다.");
    }
  }
}
