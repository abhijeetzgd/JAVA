import java.io.*;

class Demo{

  public static void main(String []args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter Length : ");
    int n = Integer.parseInt(br.readLine());

    System.out.print("Enter breadth : ");
    int m = Integer.parseInt(br.readLine());

    System.out.println("Area of rectangle is "+(n*m));

  }
}
