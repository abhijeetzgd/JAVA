import java .io.*;

class Demo{

  public static void main(String []args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter a number : ");
    int n = Integer.parseInt(br.readLine());

    System.out.print("1 ");
    for(int i=1;i<=n;i++){
      int sum =0;
      for(int j=1;j<=i-1;j++){
        if(i%j==0){
          sum = sum + j;
        }
      }
      if(sum == i)
        System.out.print(i+" ");
    }
    System.out.print("\n");

  }
}
