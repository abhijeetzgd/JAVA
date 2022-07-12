import java .io.*;

class IntDemo{

  public static void main(String [] arg)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter a number");
    String input1 = br.readLine();
    System.out.println(input1);

    System.out.println("Enter a number");
    String input2 =br.readLine();

    System.out.println(input2);
    System.out.println(input1+input2);

    //br.close();


  }
}
