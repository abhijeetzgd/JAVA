import java.io.*;
class userInput{

  public static void main(String []ars)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter array size : ");
    int x = Integer.parseInt(br.readLine());

    int []iarr = new int[x];

    System.out.println("Enter array Elements : ");

    for(int i=0;i<x;i++){

      iarr[i] = Integer.parseInt(br.readLine());
    }
System.out.println("Array elements are : ");

    for(int i=0;i<iarr.length;i++){
        if(iarr[i]%5==0)
      System.out.println(iarr[i]+" Divisible by 5");
      else
      System.out.println(iarr[i]+" not Divisible by 5");

    }
  }
}
