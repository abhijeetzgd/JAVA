class Demo {

  public static void main(String [] args){
int n =1;
    while(n>=1){

        if(n%32 == 0 && n%7 ==0){
          System.out.println(n);
        }
         if(n%32 == 0 && n%7 ==0 && n%6==0) {
          System.out.println("breaking loop");
          System.out.print(n);
          System.out.println("is divisible by 6");
          break;
        }
        n++;

    }
  }
}
