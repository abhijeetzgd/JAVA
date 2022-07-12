import java.io.*;

class Demo {

  public static void main(String [] args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter distance in meter ");
    int dist = Integer.parseInt(br.readLine());

    System.out.println("Enter time in second ");
    int time = Integer.parseInt(br.readLine());

    System.out.println(dist/time+" m/s is the velocity");


  }
}
