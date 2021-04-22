import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Yazı giriniz : ");
    Scanner scanner = new Scanner(System.in);
    String data = scanner.nextLine();

    ArrayList<String> words = getWords(data, 0);

    System.out.println("Words are : " + words.toString());
  }

  static ArrayList<String> getWords(String c, int index) {
    ArrayList<String> __tmp = new ArrayList<String>();
    int lastSpace = 0;
    boolean isSpacedOut = false;
    for (int i = index+1; i < c.length(); i++)  {
      ArrayList<String> tmp = new ArrayList<String>();
      if (c.charAt(i) == ' ') {
        String pla = "";
        for (int k = index; k < i; k++) pla += c.charAt(k);
        if (pla.charAt(0) == ' ') {
          String asd = "";
          for (int o = 1; o < pla.length(); o++) asd += pla.charAt(o);
          pla = asd;
        }
        __tmp.add(pla);
        tmp = getWords(c, i);
        
        for (int j = 0; j < tmp.size(); j++) __tmp.add(tmp.get(j));
        isSpacedOut = true;
        break;
      }
    }
    if (!isSpacedOut) { 
      String word = "";
      for (int i = index; i < c.length(); i++) word += c.charAt(i);
      __tmp.add(word);
    }
    return __tmp;
  }
}