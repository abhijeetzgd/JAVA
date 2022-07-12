class TernaryDemo {

  public static void main(String []args){

      int x = 5;
      int y = 20;
      int z = 22;
      int ans = 0;

ans =(x < y) ? ((x<z) ? x : z) :((y<z)? y : z);
System.out.println("is the smallest"+ans);


}}
