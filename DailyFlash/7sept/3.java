import java.io.*;

class Demo {

  public static void  main(String []arg)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter a number : ");
    int a = Integer.parseInt(br.readLine());

    System.out.print("Enter second number : ");
    int n = Integer.parseInt(br.readLine());

    System.out.println("quotient = "+a/n);
    System.out.println("reminder = "+a%n);


  }
}
