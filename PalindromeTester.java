import java.util.Scanner;

public class PalindromeTester{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("would you like to enter a palindrome? (y/n)");
    String answer = scan.nextLine();
    if(answer == "y"){
      System.out.println("Enter a palindrome");
      String palindrome = scan.nextLine();
      int palindromeLength = palindrome.length();
      System.out.println(palindromeLength);
    }else{
      System.out.println("Bye");
    }
  }
}
