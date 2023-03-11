package part3;
import java.util.Scanner;

public class problem08 {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수 몇 개? : ");
    int a = sc.nextInt();
    int[] intArray = new int[a];
    // 정수 생성을 위한 반복문
    for (int i=0; i<intArray.length; i++) {
      int number = (int)(Math.random() * 100 + 1);
      boolean isOk;
      // 중복 확인을 위한 반복문
      do {
        isOk = false;
        for(int j=0; j<i; j++) {
          if (number == intArray[j]) {
            isOk = true;
            number = (int)(Math.random() * 100 + 1);
            break;
          }
        }
      } while(isOk);
      intArray[i] = number;
    }
    for (int i=0; i<intArray.length; i++) {
      System.out.print(intArray[i]+ " ");
    }
  }
}
