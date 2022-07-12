import java.io.BufferedReader;
import java.io.InputStreamReader;

class c2w {

  public static void main(String arr[])throws IOException {

    InputStreamreader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    int highScore = br.readLine();
    System.out.println(highScore);
  }
}
