import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{
  public static void main(String[] args){
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    int wins = 0;
    int games = 0;
    //Explaining the inputs
    System.out.println("choose Rock(1), Paper(2), or Scissors(3). enter 0 to escape");
    int userInput = scan.nextInt();

    //Determine if the first input is valid
    while(userInput>3 || userInput<0){
      System.out.println("must choose a number between 1 and 3");
      userInput = scan.nextInt();
    }

    while(userInput != 0){
    int computerInput = rand.nextInt(3)+1;
    String userChoice = "";
    String computerChoice = "";

    //Make it display yours and the computers choices instead of numbers
    if(userInput == 1){
      userChoice = "Rock";
    }
    if(userInput == 2){
      userChoice = "Paper";
    }
    if(userInput == 3){
     userChoice = "Scissors";
    }
    if(computerInput == 1){
      computerChoice = "Rock";
    }
    if(computerInput == 2){
      computerChoice = "Paper";
    }
    if(computerInput == 3){
      computerChoice = "Scissors";
    }
    System.out.println("you chose "+userChoice);
    System.out.println("the computer chose "+computerChoice);
    //Deciding who wins Rock(1) Paper(2) Scissors(3)
      if((computerInput == 1) && (userInput == 3)){
        System.out.println("You Lose");
        games++;
      }
      if((computerInput == 1) && (userInput == 2)){
        System.out.println("You Won");
        wins++;
        games++;
      }
      if((computerInput == 1) && (userInput == 1)){
        System.out.println("You Tied");
        games++;
      }
      if((computerInput == 2) && (userInput == 3)){
        System.out.println("You Won");
        wins++;
        games++;
      }
      if((computerInput == 2) && (userInput == 2)){
        System.out.println("You Tied");
        games++;
      }
      if((computerInput == 2) && (userInput == 1)){
        System.out.println("You Lose");
        games++;
      }
      if((computerInput == 3) && (userInput == 3)){
        System.out.println("You Tied");
        games++;
      }
      if((computerInput == 3) && (userInput == 2)){
        System.out.println("You Lose");
        games++;
      }
      if((computerInput == 3) && (userInput == 1)){
        System.out.println("You Won");
        wins++;
        games++;
      }
    //Checks again if the input is valid
    System.out.println("enter Rock(1), Paper(2), or Scissors(3) to play again. enter 0 to escape");
    userInput = scan.nextInt();
    while(userInput>3 || userInput<0){
      System.out.println("must choose a number between 1 and 3");
      userInput = scan.nextInt();
    }
    }
    double winPercentage = ((double) wins/games)*100;

  System.out.println("your win percentage is "+ Math.round(winPercentage)+"%");
  }
}
