import java.util.Scanner;

public class PalindromeTester{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("would you like to enter a palindrome? (y/n)");
    String answer = scan.nextLine();
    String N = "n";
    String reversePalindrome = "";
    String letter = "";
    answer = answer.toLowerCase();
    while(answer.compareTo(N) != 0){
      System.out.println("Enter a palindrome enter 0 to exit");
      String O = "0";
      reversePalindrome = "";
      String palindrome = scan.nextLine();
      if(palindrome.compareTo(O)==0){
        break;
      }
      palindrome = palindrome.replaceAll("\\s+", "");
      palindrome = palindrome.replaceAll(",", "");
      palindrome = palindrome.replaceAll(".", "");
      palindrome = palindrome.toLowerCase();
      int palindromeLength = palindrome.length();
      for(int i=palindromeLength; i>0; i--){
        letter = palindrome.substring(i-1,i);
        reversePalindrome = reversePalindrome + letter;
      }
      if(palindrome.compareTo(reversePalindrome)==0){
        System.out.println("this is a palindrome");
      }else{
        System.out.println("this isn't a palindrome");
      }
    }
    System.out.println("Bye");
  }
}
