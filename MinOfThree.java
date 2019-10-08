import java.util.Scanner;

public class MinOfThree{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer");
    int a = scan.nextInt();
    System.out.println("enter an integer");
    int b = scan.nextInt();
    System.out.println("enter an integer");
    int c = scan.nextInt();
    if(a < b || a < c){
      System.out.println("The smallest number is: "+a);
    }else if(b < c){
      System.out.println("The smallest number is: "+b);
    }else{
      System.out.println("The smallest number is: "+c);
    }
  }
}
