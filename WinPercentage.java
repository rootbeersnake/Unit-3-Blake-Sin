import java.util.Scanner;
import java.text.DecimalFormat;

public class WinPercentage{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    System.out.println("enter the number of games played");
    int gamesPlayed = scan.nextInt();
    while(gamesPlayed < 1){
      System.out.println("you must play atleast one game");
      gamesPlayed = scan.nextInt();
    }
    System.out.println("enter the number of wins you had");
    int gamesWon = scan.nextInt();
    while(gamesWon < 0){
      System.out.println("total wins must be atleast 0");
      gamesWon = scan.nextInt();
    }
    while(gamesWon > gamesPlayed){
      System.out.println("can't win more games than you played. enter the wins");
      gamesWon = scan.nextInt();
    }
    double winPercent = (double) gamesWon/gamesPlayed;
    System.out.println("("+gamesPlayed+","+gamesWon+")"+" = "+ decimalFormat.format(winPercent*100)+"%");
  }
}
