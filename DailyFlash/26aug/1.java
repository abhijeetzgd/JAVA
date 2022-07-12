import java.io.*;

class Demo{

  public static void main(String []  argd)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter a range for printing Square : ");
    int n = Integer.parseInt(br.readLine());

    for(int i=1;i<=n;i++){

      System.out.println("Sqaure of "+i+" is "+i*i);
    }
  }
}
