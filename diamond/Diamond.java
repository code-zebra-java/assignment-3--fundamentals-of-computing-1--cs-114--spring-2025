import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Please type in a number to create a diamond:");
    int userInput = scan.nextInt;

    //Choice for odd numbers
    if (userInput % 2 == 1){
      int spaceAmount = userInput/2;

      //prints the first half of the diamond
      for(int i = 1; i <= userInput; i+=2){
        //print out the right amount of spaces
        for (int j = spaceAmount; j > 0; j--){
          System.out.print(" ");
        }
        spaceAmount--;
        //print out the correct amount of symbols
        for(int k = 0; k < i; k++){
          System.out.print("*");
        }
        System.out.print("\n");
      }
      spaceAmount++;

      //prints the second half of the diamond
      for(int i = userInput-2; i > 0; i-=2){
        //print out the right amount of spaces
        for (int j = spaceAmount; j > 0; j--){
          System.out.print(" ");
        }
        spaceAmount++;
        //print out the correct amount of symbols
        for(int k = 0; k < i; k++){
          System.out.print("*");
        }
        System.out.print("\n");
      }
    }
    //choice for even numbers
    else{
      int spaceAmount = userInput-1;

      //prints the first star
      for(int i = spaceAmount; i > 0; i--){
        System.out.print(" ");
      }
      System.out.print("*");
      spaceAmount--;

      //prints the rest of the first half of the diamond
      for(int i = 2; i <= userInput; i+=2){
        //print out the right amount of spaces
        for (int j = spaceAmount; j > 0; j--){
          System.out.print(" ");
        }
        spaceAmount -= 2;
        //print out the correct amount of symbols
        for(int k = 0; k < i; k++){
          System.out.print("* ");
        }
        System.out.print("\n");
      }
      spaceAmount += 2;

      //prints the second half of the diamond without the last star
      for(int i = userInput-2; i > 0; i-=2){
        //print out the right amount of spaces
        for (int j = spaceAmount; j > 0; j--){
          System.out.print(" ");
        }
        spaceAmount += 2;
        //print out the correct amount of symbols
        for(int k = 0; k < i; k++){
          System.out.print("* ");
        }
        System.out.print("\n");
      }

      //prints the last star
      spaceAmount++;
      for(int i = spaceAmount; i > 0; i--){
        System.out.print(" ");
      }
      System.out.print("*");


    }

  }
}
