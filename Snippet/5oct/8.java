import java.io.*;

class Demo {

  public static void main(String []args)throws IOException{

    BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

    float var1 = Integer.parseInt(br.readLine());
    float var2 = Integer.parseInt(br.readLine());
    System.out.println(++var1 + var2++);
    }
}
