import java .io.*;
class Demo {

  public static void main(String [] args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter The first Number : ");
    int a=Integer.parseInt(br.readLine());

    System.out.println("Enter The Second Number : ");
    int n=Integer.parseInt(br.readLine());

    System.out.println("Addition = "+(a+n));
    if(a>n)
        System.out.println("Subtraction = "+(a-n));
    else
        System.out.println("Subtraction = "+(n-a));

  }
}
