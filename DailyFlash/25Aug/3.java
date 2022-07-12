import java.io.*;

class Demo{

  public static void main(String []args)throws IOException{
    int sum=0;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter a Number : ");
    int n = Integer.parseInt(br.readLine());

    if(n%2 == 0){
    System.out.println("Enetred number "+n+" is Even");
}else{
  System.out.println("Enetred number "+n+" is Odd");

}
  }
}
