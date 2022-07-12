import java.io.*;

class Demo{

  public static void main(String [] r)throws IOException{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter number of planes : ");
    int plane = Integer.parseInt(br.readLine());

    System.out.print("Enter number of row : ");
    int row = Integer.parseInt(br.readLine());

    System.out.print("Enter number of col : ");
    int col = Integer.parseInt(br.readLine());

    int arr[][][] = new int[plane][row][col];

    System.out.print("Enter elements of array : ");

    for(int i=0;i<plane;i++){

      for(int j=0;j<row;j++){

        for(int k=0;k<col;k++){

          arr[i][j][k]=Integer.parseInt(br.readLine());
        }
      }
    }


    for(int i=0;i<plane;i++){

      System.out.println("plane "+i);
        for(int j=0;j<row;j++){

          for(int k=0;k<col;k++){

              System.out.print(" "+arr[i][j][k]);

        }System.out.print("\n");
      }
    }

  }
}
