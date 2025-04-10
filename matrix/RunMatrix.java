import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Please type in a number to create a matrix: ");
    int userInput = scan.nextInt();

    Matrix myMatrix = new Matrix(userInput);
    myMatrix.populateMatrix();
    myMatrix.printMatrix();


  }
}
