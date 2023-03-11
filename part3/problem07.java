package part3;
import java.util.Scanner;

public class problem07 {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    int[] intArray = new int[10];
    double sum = 0;
    System.out.print("랜덤한 정수들 : ");
    for(int i=0; i<intArray.length; i++) {
      intArray[i] = (int)(Math.random() * 10 + 1);
      System.out.print(intArray[i]+ " ");
    } 
    System.out.println();
    for(int i=0; i<intArray.length; i++) {
      sum += intArray[i];
    }
    System.out.println("평균은 " + sum/intArray.length);
  }
}
