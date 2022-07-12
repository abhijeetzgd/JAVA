/*
Question 4. Write a program to take input of 3 numbers using BufferedReader class and print them
in ascending and descending order.
Input:
6 50 33
Output:
Ascending order is: 6 33 50.
Descending order is: 50 33 6.
Note: Do not sort. Use if-else to set min, mid and max and print accordingly
*/
import java.io.*;
class Demo {

  public static void main(String [ ]args)throws IOException{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter the First number : ");
    int n1 = Integer.parseInt(br.readLine());
//    System.out.println(n1);

    System.out.println("Enter the Second number : ");
    int n2 = Integer.parseInt(br.readLine());
  //  System.out.println(n2);

    System.out.println("Enter the Third number : ");
    int n3 = Integer.parseInt(br.readLine());
    //System.out.println(n3);

    if(n1>n2 && n2>n3){
      System.out.print(" "+n1);
      System.out.print(" "+n2);
      System.out.println(" "+n3);

      System.out.print(" "+n3);
      System.out.print(" "+n2);
      System.out.println(" "+n1);

    }
    if(n2>n3 && n3>n1){
      System.out.print(" "+n2);
      System.out.print(" "+n3);
      System.out.println(" "+n1);

      System.out.print(" "+n1);
      System.out.print(" "+n3);
      System.out.println(" "+n2);
}
    if(n3>n1 && n3>n2){
      System.out.print(" "+n3);
      System.out.print(" "+n1);
      System.out.println(" "+n2);

      System.out.print(" "+n2);
      System.out.print(" "+n1);
      System.out.println(" "+n3);
}
if(n1>n3 && n3>n2){
  System.out.print(" "+n1);
  System.out.print(" "+n3);
  System.out.println(" "+n2);

  System.out.print(" "+n2);
  System.out.print(" "+n3);
  System.out.println(" "+n1);

}
if(n2>n1 && n1>n3){
  System.out.print(" "+n2);
  System.out.print(" "+n1);
  System.out.println(" "+n3);

  System.out.print(" "+n3);
  System.out.print(" "+n1);
  System.out.println(" "+n2);
}
if(n3>n2 && n2>n3){
  System.out.print(" "+n3);
  System.out.print(" "+n1);
  System.out.println(" "+n2);

  System.out.print(" "+n2);
  System.out.print(" "+n1);
  System.out.println(" "+n3);
}


  }
}
