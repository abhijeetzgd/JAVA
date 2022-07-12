class Demo{

  public static void main(String []args){

    int n = 12345;
    int rem = 0;
    int sum=0;
    int mul =1;

    while(n>0){
      rem=n%10;
      if(rem%2==0){
        sum = sum + rem;
      } else {
        mul = mul * rem;
      }
      n=n/10;
    }
    System.out.println(sum);
    System.out.println(mul);

  }
}
