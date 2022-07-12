import java.io.*;

class Demo{

  public static void main(String []args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter number : ");
    int n = Integer.parseInt(br.readLine());

    for(int i=10;i>=1;i--){
      System.out.println(n+" * "+i+" = "+n*i);
    }

  }
}
