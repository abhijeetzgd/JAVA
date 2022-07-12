import java.io.*;
class Demo{

    public static void main(String []args)throws IOException{

      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);

      System.out.println("Enter a first number : ");
      int a = Integer.parseInt(br.readLine());

      System.out.println("Enter a second number : ");
      int n = Integer.parseInt(br.readLine());
      int sum=0;
      int fact=1;


        for (int i=a;i<=n;i++){
          fact =1;
          for(int j=1;j<=i;j++){
            fact = fact * j;
          }
          System.out.println("fact of "+i+" is = "+fact);
        }

    }
}
