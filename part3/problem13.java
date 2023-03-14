package part3;

public class problem13 {
  public static void main(String[] arg) {
    int[] intArray = new int[100];
    // intArray에 값 넣기
    for(int i=0; i<intArray.length; i++) {
      intArray[i] = i+1;
    }
    for(int i=0; i<intArray.length; i++) {
      if (intArray[i] % 10 == 3 || intArray[i] % 10 == 6 || intArray[i] % 10 == 9 || intArray[i] / 10 ==  3 || intArray[i] / 10 == 6 || intArray[i] / 10 == 9) {
        if ((intArray[i] / 10 ==  3 || intArray[i] / 10 == 6 || intArray[i] / 10 == 9) && (intArray[i] % 10 == 3 || intArray[i] % 10 == 6 || intArray[i] % 10 == 9)) {
          System.out.println(intArray[i] + " 박수 짝짝");
        } else {
          System.out.println(intArray[i] + " 박수 짝");
        }
      }
    }
  }
}
