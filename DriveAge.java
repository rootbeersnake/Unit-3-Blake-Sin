import java.util.Scanner;
public class DriveAge{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your age");
    int age = scan.nextInt();
    if(age >= 17 && age >=21){
      System.out.println("Your old enough to drink and drive");
    }else if(age >= 17){
      System.out.println("Your old enough to drive but not drink");
    }else{
      System.out.println("Your not old enough to drink or drive");
    }
  }
}
