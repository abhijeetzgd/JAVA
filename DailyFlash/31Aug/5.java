import java.io.*;
class Demo{

  public static void main(String []ars)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("Enter number : ");
    int n = Integer.parseInt(br.readLine());
    System.out.println("Its perfect divisors are : ");
    for (int i=1;i<=n/2+1;i++){
      if(n%i==0){
        System.out.print(" "+i);
      }
    }
System.out.println("");

  }
}
