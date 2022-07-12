import java.io.*;

class Demo {

  public static void main(String [] args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter first number ");
    int a = Integer.parseInt(br.readLine());

    System.out.println("Enter second number ");
    int n = Integer.parseInt(br.readLine());

    if(a>n)
    System.out.println(n+" is minimum among "+a+" & "+n);
    else
    System.out.println(a+" is minimum among "+a+" & "+n);

  }
}
