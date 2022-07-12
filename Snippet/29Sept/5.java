import java.io.*;

class c2w {

  public static void main(String arr[]) {
try{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

  }
  catch(IOException obj){
    System.out.println("IOException occured");
  }

  char tier = br.read();
  System.out.println(tier);

  }
}
