import java.util.Scanner;

public class Temp{
  public static void main(String[]args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the temperature");
      int temp = scan.nextInt();
      if(temp >= 83){
        System.out.println("Hot");
      }else if(temp >= 68){
        System.out.println("Ideal");
      }else if(temp >= 45){
        System.out.println("cool");
      }else{
        System.out.println("Cold");
      }
  }
}
