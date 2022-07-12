import java.io.*;

class Demo{

  public static void main(String []  argd)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter a number for printin table : ");
    int n = Integer.parseInt(br.readLine());

    System.out.println("Table of "+n);

    for(int i=1;i<=10;i++){

      System.out.print(" "+n*i);
    }
    System.out.print("\n");
  }
}
