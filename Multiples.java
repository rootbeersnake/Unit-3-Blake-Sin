import java.util.Scanner;

public class Multiples{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the number you want multiplied");
    int base = scan.nextInt();
    if(base <1){
      System.out.println("must be at least 1");
      base = scan.nextInt();
    }
    System.out.println("enter the limit");
    int limit = scan.nextInt();
    if(limit < base){
      System.out.println("limit must be more than the number you want multiplied");
      limit = scan.nextInt();
    }
    int runs = 0;
    for(int i = 1; i <= limit/base; i++){
      if(runs == 5){
        System.out.println("  ");
        runs = 0;
      }
      if(i*base<10){
      System.out.print(i*base+"      ");
      runs++;
    }else if(i*base<100){
      System.out.print(i*base+"   ");
    }else if(i*base<999){
      System.out.print(i*base+"       ");
      runs++;
    }else if(i*base<9999){
      System.out.print(i*base+"     ");
    }else if(i*base<99999){
      System.out.print(i*base+"     ");
    }
    }
  }
}
