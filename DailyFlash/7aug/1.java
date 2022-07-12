class Demo{

  public static void main(String []args){

    int n = 12345;
    int rem = 0;
    int cnt=0;
    while(n>0){
      rem=n%10;
      cnt++;
      n=n/10;
    }
    System.out.println(cnt);
  }
}
