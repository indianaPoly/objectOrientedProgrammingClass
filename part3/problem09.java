package part3;

public class problem09 {
  public static void main(String[] arg) {
    int[][] intArray = new int[4][4];
    for(int i=0; i<intArray.length; i++) {
      for(int j=0; j<intArray[i].length; j++) {
        intArray[i][j] = (int)(Math.random()*10 + 1);
        System.out.print(intArray[i][j] + "  ");
      }
      System.out.println();
      System.out.println();
    }
  }
}
