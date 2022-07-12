/*
Question 3. Write a program in java to take single character as input and check whether the entered
character as vowel or consonant.
Input:
a
Output:
a is Vowel.
Input :
V
Output :
V is a consonant
*/
import java.io.*;
class Demo {

  public static void main(String [  ]args)throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter character : ");
    char ch = (char) br.read();

    if(ch == 'a' || ch =='i' || ch =='o' || ch =='e' || ch =='u')
        System.out.println(ch+" is vovel");
    else
        System.out.println(ch+" is Consonent");

  }
}
