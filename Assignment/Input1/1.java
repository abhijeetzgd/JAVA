import java.io.*;

class Demo{

    public static void main(String[] args)throws IOException{

      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);

      System.out.print("Enter Intger Number = ");
      int num=Integer.parseInt(br.readLine());
      System.out.println(num);

      System.out.print("Enter Float Number = ");
      float f=Float.parseFloat(br.readLine());
      System.out.println(f);

      System.out.print("Enter Double Number = ");
      double d=Double.parseDouble(br.readLine());
      System.out.println(d);

      System.out.print("Enter Long Number = ");
      long l=Long.parseLong(br.readLine());
      System.out.println(l);

      System.out.print("Enter Boolean Number = ");
      boolean b=Boolean.parseBoolean(br.readLine());
      System.out.println(b);

      System.out.print("Enter String = ");
      String str=br.readLine();
      System.out.println(str);

      System.out.print("Enter character = ");
      char ch=(char)br.read();
      System.out.println(ch);

    }

}
