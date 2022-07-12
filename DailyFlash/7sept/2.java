import java.io.*;

class Demo {

  public static void  main(String []arg)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter mass of particle : ");
    int mass = Integer.parseInt(br.readLine());

    System.out.print("Enter velocity of particle : ");
    int velocity = Integer.parseInt(br.readLine());

    System.out.println("K.E of particle = "+0.5*mass*velocity*velocity);


  }
}
