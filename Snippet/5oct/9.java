import java.io.*;

class Demo {

  public static void main(String []args)throws IOException{

    BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

    char var1 = (char)br.read();
    br.close();
    String var2 =  br.readLine();

    System.out.println(var1 + var2);
    }
}
