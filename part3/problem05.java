package part3;
import java.util.Scanner;

public class problem05 {
  public static void main(String[] arg) {
    int[] intArray = new int[10];
    Scanner sc = new Scanner(System.in);
    System.out.print("양의 정수 10개를 입력하시오>>");
    // 배열 생성
    for (int i=0; i<intArray.length; i++) {
      // 키보드에서 입력받은 정수 저장
      intArray[i] = sc.nextInt();
    }
    System.out.print("3의 배수는 ");
    for (int i =0; i<intArray.length; i++) {
      if (intArray[i] % 3 == 0) {
        System.out.print(intArray[i]+ " ");
      }
    }
    System.out.println();
  }
}
