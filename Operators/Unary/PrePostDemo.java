class PrePostDemo{
  public static void main(String [] args){

    int num = 10;
    int ans =0;

    ans = ++num;

    System.out.println(ans);  //11
    System.out.println(num);  //11

    num=10;
    ans = num++;
    System.out.println(ans);  //10
    System.out.println(num);  //11

  }
}
