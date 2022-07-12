import java.io.*;

class Demo{

  public static void main(String []args)throws IOException{
    int sum=0;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Enter a row : ");
    int row = Integer.parseInt(br.readLine());

    System.out.println("Enter a col : ");
    int col = Integer.parseInt(br.readLine());

for(int i =1;i<=row;i++){

  for(int j=1 ; j<=col;j++){

    if(j%col != 0){
      if(i%2==0){
      System.out.print("0 ");
    }else{
      System.out.print("1 ");
    }

  }else{

    if(i%2==0){
    System.out.println("0 ");
  }else{
    System.out.println("1 ");
  }

  }
}
  }
}
}
