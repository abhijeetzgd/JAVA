import java.io.*;
class Demo{

  public static void main(String []args)throws IOException{

      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);

      System.out.print("Enter first number : \n");
      int a = Integer.parseInt(br.readLine());

      System.out.print("Enter second number : \n");
      int n = Integer.parseInt(br.readLine());

      if(a>n)
      System.out.println("Maximun number is "+a);
      else
      System.out.println("Maximun number is "+n);

}
}
