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
    System.out.println("Sum of Number upto "+n+" is "+sum);

  }
}
