import java .io.*;

class IOExceptionDemo{

  public static void main(String [] arg)throws IOException{

  //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    String input1 = br.readLine();
    System.out.println(input1);

    String input2 = br.readLine();
    System.out.println(input2);

    isr.close();

    br.readLine();
  }
}
