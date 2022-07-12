import java.io.*;

class Demo {

  public static void main(String [] args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter first number");
    int a = Integer.parseInt(br.readLine());

    System.out.println("Enter second number ");
    int b = Integer.parseInt(br.readLine());

    System.out.println("Enter third number ");
    int c = Integer.parseInt(br.readLine());

    if(a<b && a<c){
    System.out.println(a+"is Minimum ");
  }else if(b<a && b<c)
    System.out.println(b+" is Minimum");
    else
    System.out.println(c+" is Minimum ");


  }
}
