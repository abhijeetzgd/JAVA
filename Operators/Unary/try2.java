class Try{
  public static void main(String []args){
    int num = 10;
    int ans = 0;

    ans = ++num + ++num;

    System.out.println(ans);//23
    System.out.println(num);//12

  }
}
