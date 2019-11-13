import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String keys;
    String value;
    String[] resultArray;
        
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string");
    keys = scanner.nextLine();

    resultArray = new String[keys.replace("0", "").length()];

    System.out.println("Enter array");

    int counterResultArray = 0;
    for(int i = 0; i < 9; i++){
      value = scanner.nextLine();
      if(keys.charAt(i) == '1'){
        resultArray[counterResultArray] = value;
        counterResultArray++;
      }
    }
    scanner.close();

    System.out.println();
    System.out.print("[");
    for(String i:resultArray){
      System.out.print("\"" + i + "\"" + ",");
    }
    System.out.print("]");
  }
}
