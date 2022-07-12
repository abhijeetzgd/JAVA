import java.io.*;

class Demo{

  public static void main(String []args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter a character : ");
    char ch = (char) br.read();
    System.out.println("Entered character is : "+ch);
  }
}
