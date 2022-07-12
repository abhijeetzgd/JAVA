import java.io.*;
class Demo{

    public static void main(String []args)throws IOException{

      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);

      System.out.println("Enter a current value : ");
      int i = Integer.parseInt(br.readLine());

      System.out.println("Enter a register value : ");
      int r = Integer.parseInt(br.readLine());

      System.out.println("Voltage V = "+i*r);

    }
}
