class Demo{

  public static void main(String []args){
int n =2;
    for(int i=1;i<=4*4;i++){
    if(i%4 == 0){
      System.out.println(" "+n);
      n=2;
    }else{
      System.out.print(" "+n);
      n=n+2;
    }
  }

  }
}
