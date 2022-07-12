import java.io.*;

class Demo {

  public static void  main(String []arg)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter first number : ");
    int a = Integer.parseInt(br.readLine());

    System.out.print("Enter Second number : ");
    int n = Integer.parseInt(br.readLine());
    System.out.println("Number before Swapping are "+a+" & "+n);
    a = a+n;
    n = a-n;
    a = a-n;

    System.out.println("Number after Swapping are "+a+" & "+n);


  }
}
