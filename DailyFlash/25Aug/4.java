import java.io.*;

class Demo{

  public static void main(String []args)throws IOException{
    int sum=0;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter a Number : ");
    int n = Integer.parseInt(br.readLine());

    for(int i=0 ;i<=n ; i++){
      sum = sum + i;

    }
    int avg = sum/n;
    System.out.println("Sum of Number upto "+n+" is "+sum+"\nAverage = "+avg);

  }
}
