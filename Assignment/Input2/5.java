/*
Question 5. Write a program to take input of a number and check whether the number is divisible by
both 5 and 10.
Input:
50
Output:
50 is divisible by both 5 and 10
*/
import java.io.*;
class Demo{

  public static void main(String []args)throws IOException{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    char y;
    //do{

      System.out.println("Enter a number ");
      int a = Integer.parseInt(br.readLine());

      if(a % 5 ==0 && a% 10 == 0)
        System.out.println(a+" is divisible by 5 and 10");
    else
      System.out.println(a+" is Not divisible by 5 and 10");

  //    System.out.println("Do you want to continue ,press y : ");
    //  y = (char) br.read();
//    } while(y=='y');
  }
}
