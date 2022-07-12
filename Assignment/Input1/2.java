import java.io.*;
class Demo{

   public static void main(String[] args)throws IOException{

      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);

      System.out.print("Enter Team name = ");
      String name=br.readLine();

      System.out.print("Enter Captain name = ");
      String cpt=br.readLine();

      System.out.print("Enter Best Win Percentage = ");
      float f=Float.parseFloat(br.readLine());

      System.out.print("Enter Number of Indian batsmen = ");
      int a=Integer.parseInt(br.readLine());

      System.out.print("Enter Number of International batsmen = ");
      int b=Integer.parseInt(br.readLine());

      System.out.println("The IPL team name is : "+name);
      System.out.println("It’s captain is : "+cpt);
      System.out.println("It has the best win percentage of : "+f);
      System.out.println("Number of Indian batsmen are : "+a);
      System.out.println("Number of International batsmen are : "+b);


   }
}
