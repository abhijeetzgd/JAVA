import java.io.*;

class c2w {

  public static void main(String arr[]) throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
int isRead = isr.read();
int brRead = br.read();

System.out.println(isRead == brRead);

  }
}
