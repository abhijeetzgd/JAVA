import java.io.*;
class Demo{

     public static void main(String[] args)throws IOException{

          InputStreamReader isr=new InputStreamReader(System.in);
          BufferedReader br=new BufferedReader(isr);

          System.out.println("Enter no of rows  : ");
          int rows=Integer.parseInt(br.readLine());
          System.out.println("Enter no of columns  : ");
          int cols=Integer.parseInt(br.readLine());

     for(int i=1;i<=rows;i++){

        for(int j=1;j<=cols;j++){

           System.out.print("0  ");

        }
     System.out.println();
     }
  }
}
