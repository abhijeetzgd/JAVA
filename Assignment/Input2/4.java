/*
Question 4. Write a program to take input of 2 numbers using BufferedReader class as range1 and
range2 and print square and cube of all the numbers between that range.
Input:
Enter range1 : 1
Enter range2 : 5
Output:
Square : 1 4 9 16 25
Cube : 1 8 27 64 125
*/

import java .io.*;

class Demo{

  public static void main(String [ ]args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter first Number : ");
    int a = Integer.parseInt(br.readLine());

    System.out.println("Enter last Number : ");
    int n = Integer.parseInt(br.readLine());

    System.out.print("Square of number = ");
    for(int i =a; i<=n ; i++){

      System.out.print(i*i+" ");
    }

    System.out.print("\ncube of number = ");
    for(int i =a; i<=n ; i++){

      System.out.print(i*i*i+" ");
    }
    System.out.println();

  }
}
