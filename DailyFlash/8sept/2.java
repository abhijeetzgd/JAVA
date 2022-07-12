import java .io.*;

class Demo{

  public static void main(String args[])throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter amount in rupee : ");
    int rupee = Integer.parseInt(br.readLine());

    System.out.println("Equivalent amount in daller = "+(rupee/70));

  }
}
