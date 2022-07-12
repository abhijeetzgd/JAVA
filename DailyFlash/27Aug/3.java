import java .io.*;
class Demo {

  public static void main(String [] args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter The first Number : ");
    int a=Integer.parseInt(br.readLine());

    System.out.println("Enter The Second Number : ");
    int n=Integer.parseInt(br.readLine());

    System.out.println("Addition of their cubes  = "+(a*a*a+n*n*n));

    System.out.println("Subtraction of their square= "+(a*a-n*n));

  }
}
