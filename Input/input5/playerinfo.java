import java.io.*;

class playerInfo{

  public static void main(String []args)throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter Player Inormation ");

    int jer = Integer.parseInt(br.readLine());
    char grade = (char)br.read();
  //  br.skip(1);
//    br.read();
    String name = br.readLine();
    float avg = Float.parseFloat(br.readLine());

    System.out.println("Jercy  : "+jer);
    System.out.println("grade  : "+grade);
    System.out.println("Name  : "+name);
    System.out.println("Average  : "+avg);
  }
}
