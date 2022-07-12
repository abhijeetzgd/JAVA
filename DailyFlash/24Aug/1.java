import java.io.*;
class Demo{

     public static void main(String[] args)throws IOException{

          InputStreamReader ir=new InputStreamReader(System.in);
          BufferedReader br=new BufferedReader(ir);
          System.out.println("Enter a last number : ");
          int num=Integer.parseInt(br.readLine());

          for(int i=1;i<=num;i++){

             System.out.print(i+" ");
          }
         System.out.println("");
     }

}
