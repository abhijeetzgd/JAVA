import java.io.*;
class Demo{

  public static void main(String [] ar)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

  System.out.println("Enter Number of row");
  int row = Integer.parseInt(br.readLine());


  System.out.println("Enter Number of col");
  int col = Integer.parseInt(br.readLine());

for(int i=1;i<=row;i++){
  for(int j=1;j<=i;j++){
    System.out.print(i);
  }System.out.print("\n");
}

  }
}
