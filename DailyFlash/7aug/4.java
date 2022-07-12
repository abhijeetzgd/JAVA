class Demo{

  public static void main(String []args){

    int n = 12345897;
    int rem = 0;
    int max=0;


    while(n>0){
      rem=n%10;
    if(max < rem)
        max =rem;
      n=n/10;
    }
    System.out.println("max number is "+max);


  }
}
