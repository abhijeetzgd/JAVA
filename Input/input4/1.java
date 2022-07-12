import java.io.*;

class Connection {

  public static void main(String []args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println(br.readLine());
    br.close();

    InputStreamReader isr1 = new InputStreamReader(System.in);

    BufferedReader br1 = new BufferedReader(isr1);
    System.out.println(br1.readLine());

  }
}
