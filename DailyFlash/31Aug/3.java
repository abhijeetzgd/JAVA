import java.io.*;
class Demo{

  public static void main(String []ars)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("Enter range : ");
    int n = Integer.parseInt(br.readLine());

    for (int i=1;i<=n;i++){
      if(i%2!=0){
        System.out.println("cube of "+i+" = "+(i*i*i)+" and sqauare of "+i+" = "+(i*i));
      }
    }


  }
}
