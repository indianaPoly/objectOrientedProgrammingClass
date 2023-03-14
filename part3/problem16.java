package part3;
import java.util.Scanner;

public class problem16 {
  public static void main(String[] arg) {
    String[] rsp = {"가위", "바위", "보"};
    Scanner sc = new Scanner(System.in);
    System.out.println("가위 바위 보 게임을 시작합니다.");

    while(true) {
      System.out.print("가위 바위 보! >> ");
      String userRsp = sc.nextLine();
      int randomNumber = (int)(Math.random()*3);
      String computerRsp = rsp[randomNumber];
      if (userRsp.equals("그만")) break;
      if (userRsp.equals("가위") || userRsp.equals("바위") || userRsp.equals("보")) {
          if (userRsp.equals(computerRsp)) {
            System.out.println("사용자 = " + userRsp + ", 컴퓨터 = " + computerRsp +", 비겼습니다.");
          } 
          else if (
            (userRsp.equals("가위") && computerRsp.equals("보")) ||
            (userRsp.equals("바위") && computerRsp.equals("가위")) ||
            (userRsp.equals("보") && computerRsp.equals("바위"))
          ) {
            System.out.println("사용자 = " + userRsp + ", 컴퓨터 = " + computerRsp +", 사용자가 이겼습니다.");
          }
          else {
            System.out.println("사용자 = " + userRsp + ", 컴퓨터 = " + computerRsp +", 컴퓨터가 이겼습니다.");
          }
      } else {
        System.out.println("값을 잘못입력했습니다. 다시 입력해주세요");
        continue;
      }      
    }
    System.out.println("게임을 종료합니다..");
  }
}
