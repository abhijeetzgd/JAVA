import java .io.*;
class Demo{

  public static void main(String []args)throws IOException{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter number : ");
    int n = Integer.parseInt(br.readLine());

    int fact =1;
    for(int i=1;i<=n;i++){

      fact = fact * i;

    }
    System.out.println("Factorial of "+n+" = "+fact);

  }
}
