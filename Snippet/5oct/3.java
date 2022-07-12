import java.io.BufferedReader;

class Demo {

  public static void main(String []args){

    BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

    String var1 = br.readLine();
    String var2 = br.readLine();
    System.out.println(var1 + var2);
  }
}
