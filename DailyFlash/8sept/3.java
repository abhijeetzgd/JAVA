import java .io.*;

class Demo{

  public static void main(String args[])throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter number of row : ");
    int row = Integer.parseInt(br.readLine());

    System.out.print("Enter number of col : ");
    int col = Integer.parseInt(br.readLine());


  for(int i=1;i<=row;i++){

    for(int j=col;j>=i;j--){

      if(i%2!=0){
        System.out.print("A ");
      }else{
        System.out.printf("B ");

      }
    }System.out.print("\n");
  }

  }
}
