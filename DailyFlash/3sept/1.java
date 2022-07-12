import java.io.*;
class Demo{

    public static void main(String []args)throws IOException{

      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);

      System.out.println("Enter a number : ");
      int n = Integer.parseInt(br.readLine());
      int sum=0;
      for(int i=1;i<=n/2;i++){
        if(n%i==0){
          sum = sum + i;
        }
      }

if(sum == n)
System.out.println(n+" is perfect number" );
else
System.out.println(n+" is not perfect number" );


    }
}
