/*
Question 1. Write a program to take 2 numbers n1 and n2 as input from user. Using switch case and
function do the following operations :
1. Addition
2. Subtraction
3. Division
4. Multiplication
*/
import java.io.*;
class Demo {

  public static void main(String []args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter the first number : ");
    int a = Integer.parseInt(br.readLine());

    System.out.println("Enter the Second number : ");
    int n = Integer.parseInt(br.readLine());

    System.out.println("Enter your Choice  +,-,*,/ : ");
    char ch = (char) (br.read());

    switch(ch){

      case '+':
      System.out.print("Addition of number = ");
      System.out.println(a+n);
      break;

      case '-':
      System.out.print("Subtraction of number = ");
      System.out.println(a-n);
      break;

      case '*':
      System.out.print("Multiple of number = ");
      System.out.println(a*n);
      break;

      case '/':
      System.out.print("Division of number = ");
      System.out.println(a/n);
      break;

      default:
      System.out.println("Enter the correct choice");
    }

  }
}
