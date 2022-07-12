import java.io.*;

class Demo {

  public static void main(String [] args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter first number ");
    int a = Integer.parseInt(br.readLine());

    System.out.println("Enter first number ");
    int n = Integer.parseInt(br.readLine());

    for(int i=a;i<=n;i++){

      if(i%2==0)
      System.out.print(i+" ");
    }
    System.out.print("\n");

  }
}
