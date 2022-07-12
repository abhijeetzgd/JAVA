import java.io.*;

class Demo {

  public static void main(String [] args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter number of rows");
    int row = Integer.parseInt(br.readLine());

    System.out.println("Enter time in column ");
    int col = Integer.parseInt(br.readLine());
    int n=1;
    for(int i=1;i<=row;i++){
      for(int j=1;j<=i;j++){
        System.out.print(n*n*n+" ");
        n++;
      }  System.out.print("\n");
    }



  }
}
