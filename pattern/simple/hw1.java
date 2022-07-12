
class Demo {

  public static void main(String []arg){

    for(int i=1;i<=4;i++){

      for(int j=1;j<=4;j++){

        if((i ==1 || j==4 ||   i==4 || j==1 )){
          System.out.print("= ");
        }else{
          System.out.print("* ");
          }
      }System.out.print("\n");
    }
  }
}
