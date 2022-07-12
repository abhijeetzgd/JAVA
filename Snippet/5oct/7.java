import java.io.*;

class Demo {

  public static void main(String []args)throws IOException{

    BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

    char var1 = (char)br.read();
    br.read();
    String var2 = br.readLine();
    System.out.println(var2 + " " +var1);

    }
}
