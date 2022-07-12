class Demo {

  public static void main(String [] args){
    int a =1;
    for(int i = 1;i<=5*5 ;i++){
      if(i%5==0){
        System.out.println(" "+a);
        a=1;
      } else {
        System.out.print(" "+a);
        a++;
      }
    }
  }
}
