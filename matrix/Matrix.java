public class Matrix {
  //values to change the terminal color
  public static final String RESET = "\u001B[0m";
  public static final String YELLOW = "\u001B[33m";

  public int[][] array;

  //creates a matrix
  public Matrix(int size){
    array = new int [size][size];

    System.out.println("The size of your matrix is "+ size +" x "+ size);
  }

  //swap the value of a matrix with specified indices
  private void swap(int x1, int y1, int x2, int y2){
    int PlaceHolder;
    PlaceHolder = array[x1][y1];
    array[x1][y1] = array[x2][y2];
    array[x2][y2] = PlaceHolder;
  }

  //populates a matrix
  public void populateMatrix(){
    int num = 1;
    //traverses through the length of the matrix
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[0].length; j++){
        array[i][j] = num++;
      }
    }
  }

  //Prints a matrix whatever a matrix holds
   public void printMatrix(){
    int xDiagonal = 0;
    int yDiagonal = array[0].length;

    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[0].length; j++){

        if(i == xDiagonal && j == yDiagonal){
          System.out.print(YELLOW + "\t" + array[i][j] + RESET);
          yDiagonal--;
          xDiagonal++;
        }
        else{
         System.out.print("\t" + array[i][j]);
        }

      }
      System.out.print("\n");
    }
   }
}
