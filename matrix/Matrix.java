

public class Matrix {
  public static final String RESET = "\u001B[0m";
  public static final String YELLOW = "\u001B[33m";

  public int[][] array;

  public Matrix(int size){
    array = new int [size][size];

    System.out.println("The size of your matrix is "+ size +" x "+ size);
  }

  private void swap(int x1, int y1, int x2, int y2){
    int PlaceHolder;
    PlaceHolder = array[x1][y1];
    array[x1][y1] = array[x2][y2];
    array[x2][y2] = PlaceHolder;
  }

  public void populateMatrix(){
    int num = 1;
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[0].length; j++){
        array[i][j] = num++;
      }
    }
  }

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
         System.out.print("\t"+RESET + array[i][j]);
        }
      }
      System.out.print("\n");
    }
   }

  // public void flipMatrix(){

  //   for(int i = array.length; i > 0; i--){
  //     for(int j = 0; j < array.length[0]; j++){
  //     }
  //   }
  //   ma[size]

  // }

}
