import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String keys;
    String value;
    String[] rezString;
    int counterRezString = 0;
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string");
    keys = scanner.nextLine();

    rezString = new String[keys.length()- keys.replace("1", "").length()];

    System.out.println("Enter array");
    
    for(int i = 0; i < 9; i++){
      value = scanner.nextLine();
      if(keys.charAt(i) == '1'){
        rezString[counterRezString] = value;
        counterRezString++;
      }
    }
    scanner.close();

    System.out.println();
    System.out.print("[");
    for(String i:rezString){
      System.out.print("\"" + i + "\"" + ",");
    }
    System.out.print("]");
  }
}
