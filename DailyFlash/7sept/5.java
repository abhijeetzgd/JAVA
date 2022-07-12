import java.io.*;

class Demo {

  public static void  main(String []arg)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter a real part of first number : ");
    int r1 = Integer.parseInt(br.readLine());

    System.out.print("Enter a imaginary part of first number : ");
    int i1 = Integer.parseInt(br.readLine());


        System.out.print("Enter a real part of second number : ");
        int r2 = Integer.parseInt(br.readLine());

        System.out.print("Enter a imaginary part of second number : ");
        int i2 = Integer.parseInt(br.readLine());
int r=0;
int i=0;
        r = r1 + r2;

  i = i1+ i2;
  if(i>=10){
    i=i%10;
    r++;
  }

  System.out.println("Addition of both number = "+r+" + i"+i );

  }
}
