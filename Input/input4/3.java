import java.io.*;

class Connection {

  public static void main(String []args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter two number");
    int a=Integer.parseInt(br.readLine());
    int b=Integer.parseInt(br.readLine());



    System.out.println("Addition = "+(a+b));
    System.out.println("subtraction = "+ (a-b));
    System.out.println("Multiplication = "+(a*b));


  }
}
