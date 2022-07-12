import java.io.*;

class c2w {

  public static void main(String arr[]) {
try{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    int key = Integer.parseInt(br.readLine());
    System.out.println(key);
  }
  catch(IOException obj){
    System.out.println("IOException occured");
  }

  }
}
