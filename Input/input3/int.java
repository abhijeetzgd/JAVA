import java .io.*;

class IntDemo{

  public static void main(String [] arg)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter a number");
    int  input1 =Integer.parseInt( br.readLine());
    System.out.println(input1);

    System.out.println("Enter a number");
    int  input2 =Integer.parseInt( br.readLine());

    System.out.println(input2);

    //br.close();

    br.readLine();
  }
}
