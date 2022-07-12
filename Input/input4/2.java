import java.io.*;

class Connection {

  public static void main(String []args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);


    System.out.println(br.readLine());
    System.out.println(br.readLine());
    br.close();
    InputStreamReader isr2 = new InputStreamReader(System.in);
    BufferedReader br2 = new BufferedReader(isr2);

    System.out.println(br2.readLine());
    System.out.println(br2.readLine());

  }
}
