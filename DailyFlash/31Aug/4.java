import java.io.*;
class Demo{

  public static void main(String []ars)throws IOException{

  for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
      if(i%2==0){
        System.out.print("1 ");
      }else{
        System.out.print("0 ");

      }
    }
    System.out.print("\n");
  }
  }
}
