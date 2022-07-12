import java.io.*;
class Demo{

     public static void main(String[] args)throws IOException{

          InputStreamReader ir=new InputStreamReader(System.in);
          BufferedReader br=new BufferedReader(ir);
          System.out.println("Enter Number : ");
          int num=Integer.parseInt(br.readLine());

          int c=1;
          while(c!=num){

           if(c%2==1)
              System.out.print(c+" ");       
           c++;
         }
         System.out.println();
     }

}
