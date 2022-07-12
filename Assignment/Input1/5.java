/*
Question 5. Write a program to take input of 2 numbers and print all the prime numbers ranging
between them and print their count.
Note: If there are no numbers to print then print a message that indicates the same.
Input:
0 30
Output:
2 3 5 7 11 13 17 19 23 29
The count is: 10
Input:
8 10
Output:
The count is: 0
No prime numbers to display.
*/
import java.io.*;

class Demo{

  public static void main(String [] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter First number : ");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter last number : ");
        int n = Integer.parseInt(br.readLine());
        int t = a;
        int cnt =0;
        do{
          int flag =0;
          for(int i =2;i<=a/2+1;i++){
            if(a%i==0){
              flag = 1;
            }
          }
          if(flag != 1){
            System.out.print(a+" ");
            cnt=cnt+1;
          }
          a++;
        }while(a!=n);
      System.out.println("\nTotal number of prime number = "+cnt);
  }
}
