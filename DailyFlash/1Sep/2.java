import java.io.*;
class Demo{

  public static void main(String []args)throws IOException{

      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);

      System.out.print("Enter first number : \n");
      int a = Integer.parseInt(br.readLine());

      System.out.print("Enter second number : \n");
      int n = Integer.parseInt(br.readLine());

      System.out.println("Numbers Before swapping : "+a+" & "+n);
        a = a + n;
        n = a-n;
        a = a-n;

      System.out.println("Numbers After swapping : "+a+" & "+n);

}
}
