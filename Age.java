import java.util.Scanner;
public class Age{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your age");
    int age = scan.nextInt();
    if(age >= 21){
      System.out.println("Your old enough to drink");
      }else{
        System.out.println("Your not old enough to drink");
      }
    }
  }
