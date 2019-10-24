import java.util.Scanner;

public class starPrinter{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    String option1 = "**********\n*********\n********\n*******\n******\n*****\n****\n***\n**\n*";
    String option2 = "*\n**\n***\n****\n*****\n******\n*******\n********\n*********\n**********";
    String option3 = "**********\n *********\n  ********\n   *******\n    ******\n     *****\n      ****\n       ***\n        **\n         *";
    String option4 = "     *\n    ***\n   *****\n  *******\n *********\n *********\n  *******\n   *****\n    ***\n     *";
    String option5 = "*********\n *******\n  *****\n   ***\n    *\n    *\n   ***\n  *****\n *******\n*********";
    System.out.println("enter a number between 1 and 5 to print a design enter 0 to exit");
    int userInput = scan.nextInt();
    if(userInput<0 || userInput >5){
      System.out.println("number must be between 1 and 5");
      userInput = scan.nextInt();
    }
    while(userInput != 0){
      if(userInput == 1){
        System.out.println(option1);
        System.out.println("enter another number between 1 and 5 to print a design enter 0 to exit");
        userInput = scan.nextInt();
        if(userInput<0 || userInput >5){
        System.out.println("number must be between 1 and 5");
        userInput = scan.nextInt();
      }else if(userInput == 2){
        System.out.println(option2);
        System.out.println("enter another number between 1 and 5 to print a design enter 0 to exit");
        userInput = scan.nextInt();
        if(userInput<0 || userInput >5){
        System.out.println("number must be between 1 and 5");
        userInput = scan.nextInt();
    }else if(userInput == 3){
      System.out.println(option3);
      System.out.println("enter another number between 1 and 5 to print a design enter 0 to exit");
      userInput = scan.nextInt();
      if(userInput<0 || userInput >5){
      System.out.println("number must be between 1 and 5");
      userInput = scan.nextInt();
  }else if(userInput == 4){
    System.out.println(option4);
    System.out.println("enter another number between 1 and 5 to print a design enter 0 to exit");
    userInput = scan.nextInt();
    if(userInput<0 || userInput >5){
    System.out.println("number must be between 1 and 5");
    userInput = scan.nextInt();
}else if(userInput == 5){
  System.out.println(option5);
  System.out.println("enter another number between 1 and 5 to print a design enter 0 to exit");
  userInput = scan.nextInt();
  if(userInput<0 || userInput >5){
  System.out.println("number must be between 1 and 5");
  userInput = scan.nextInt();
}
}
}
}
}
}
}
}
}
