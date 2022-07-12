import java.io.*;

class Demo {

  public static void  main(String []arg)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter a number : ");
    int row = Integer.parseInt(br.readLine());

    System.out.print("Enter second number : ");
    int col = Integer.parseInt(br.readLine());

    int n=row+4;
for(int i=1;i<=row;i++){

  for(int j=1; j<=i ;j++){
    n--;
    System.out.print(" "+n);
  }System.out.print("\n");
  n=n+1;
}


  }
}
