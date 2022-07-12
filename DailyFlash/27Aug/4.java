import java .io.*;
class Demo {

  public static void main(String [] args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter The first Number : ");
    int a=Integer.parseInt(br.readLine());

    System.out.println("Enter The Second Number : ");
    int b=Integer.parseInt(br.readLine());

    System.out.println("Enter the operation you want to perform : ");
    char ch=(char) br.read();

    switch (ch) {
        case '+':
        System.out.println("Addition of "+a+" & "+b+" = "+(a+b));
        break;

        case '-':
        System.out.println("subtraction of "+a+" & "+b+" = "+(a-b));
        break;

        case '*':
        System.out.println("multiplication of "+a+" & "+b+" = "+(a*b));
        break;

        case '/':
        System.out.println("Division of "+a+" & "+b+" = "+(a/b));
        break;

        case '%':
        System.out.println("Modulus of "+a+" & "+b+" = "+(a%b));
        break;
    }

  }
}
