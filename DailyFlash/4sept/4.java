import java.io.*;

class Demo{

  public static void main(String []args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter Length : ");
    int row = Integer.parseInt(br.readLine());

    System.out.print("Enter breadth : ");
    int col = Integer.parseInt(br.readLine());
    int n=row;

    for(int i=1;i<=row;i++){
      n=row-i;
      for(int j=1;j<=i;j++){

        System.out.print(n+" ");
        n++;
      }        System.out.print("\n");

    }

  }
}
