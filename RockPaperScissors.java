import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{
  public static void main(String[] args){
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    String userInput = scan.nextLine();
    String O = "0";
    System.out.println("choose Rock(R), Paper(P), or Scissors(S). enter 0 to escape");
    userInput = userInput.toUpperCase();
    while(userInput != O){
    int computerInput = rand.nextInt(3)+1;
    System.out.println(userInput);
    System.out.println(computerInput);
    if(userInput.equals("R"))
    System.out.println("enter R, P, or S to play again. enter 0 to escape");
    userInput = scan.nextLine();
    }
  }
}
