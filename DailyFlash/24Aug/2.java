import java.io.*;
class Demo{

     public static void main(String[] args)throws IOException{

          int sum=0;

          InputStreamReader ir=new InputStreamReader(System.in);
          BufferedReader br=new BufferedReader(ir);

          System.out.println("Enter a number : ");
          int num=Integer.parseInt(br.readLine());

          for(int i=1;i<=num;i++){

             sum=sum+i;
          }
         System.out.println("The sum of first "+num+" natural Numbers: "+sum);
     }

}
