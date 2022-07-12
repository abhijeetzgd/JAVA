import java.io.*;
class Demo{

  public static void main(String []args)throws IOException{

      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);

      System.out.print("Enter first number : \n");
      int a = Integer.parseInt(br.readLine());

      System.out.print("Enter second number : \n");
      int n = Integer.parseInt(br.readLine());

      System.out.println("Series of odd number from given range : ");

      for(int i=a;i<=n;i++){
        if(i%2!=0)
          System.out.print(i+" ");
      }
      System.out.print("\n");

  }
}
