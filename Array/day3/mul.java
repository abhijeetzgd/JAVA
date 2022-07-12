import java.util.*;

class Demo{

  public static void main(String []arsg){

    Scanner sc = new Scanner(System.in);

    System.out.print("enter number of row in array : ");
    int row = sc.nextInt();

    System.out.print("enter number of col in array : ");
    int col = sc.nextInt();

    int [][]arr = new int[row][col];
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){

        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("Elements are");
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){

        System.out.print(arr[i][j]+" ");
      }System.out.print("\n");
    }
  }
}
