package part3;

public class problem10 {
  public static void main(String[] arg) {
    int[][] intArray = new int[4][4];
    // 배열 완성
    for (int i=0; i<intArray.length; i++) {
      for (int j=0; j<intArray[i].length; j++) {
        intArray[i][j] = (int)(Math.random() * 10 + 1);
      }
    }
    // 아무 배열 뽑아서 0으로 대체
    for (int i=0; i<6; i++) {
      while(true) {
        int j = (int)(Math.random() * 4);
        int k = (int)(Math.random() * 4);
        if (intArray[j][k] == 0) {
          continue;
        } else {
          intArray[j][k] = 0;
          break;
        }
      }
    }
    // 배열 출력
    for (int i=0; i<intArray.length; i++) {
      for (int j=0; j<intArray[i].length; j++) {
        System.out.print(intArray[i][j] + " ");
      }
      System.out.println();
    }
  }
}
