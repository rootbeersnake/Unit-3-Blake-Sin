import java.util.Scanner;

public class Words{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a string");
    String word = scan.next();
    for(int i=0; i < word.length(); i++){
      System.out.println(word.charAt(i));
    }
  }
}
