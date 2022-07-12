import java.io.*;

class Demo{

  public static void main(String []args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter number : ");
    int n = Integer.parseInt(br.readLine());

    System.out.println("second Predecessor : "+(n-2)+"\nsecond successor : "+(n+2));

  }
}
