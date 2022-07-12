import java .io.*;

class Demo{

  public static void main(String args[])throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter range from 1 - : ");
    int n = Integer.parseInt(br.readLine());
    int a=1;
    for(int i=1;i<n;i++){
      System.out.print(a+" ");
      a=a+n;
    }
    System.out.print("\n");
  }
}
