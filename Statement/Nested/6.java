class Demo {

  public static void main(String [] args){
    int n=0,a=1;

    for(int i=1 ; i<=9;i++){

      if(i%3 ==0){

        a=a+2;
        System.out.println(n+"\t");
        n=n+a;
      }else {

        a=a+2;
        System.out.print(n+"\t");
        n=n+a;
      }
    }
  }
}
