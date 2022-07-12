class LogicalDemo{
  public static void main(String [] args){
    int x=2;
    int y=3;
    boolean ans;

    ans = (++x < y++) && (x++ < ++y);
    System.out.println("ans ="+ans);//false
    System.out.println("ans ="+x);//4
    System.out.println("ans ="+y);//5

    //correct output false    x=3    y=4

    ans = (++x <= y++) || (x++ > ++y);
    System.out.println("ans ="+ans);//true
    System.out.println("ans ="+x);//4
    System.out.println("ans ="+y);//5
//second one is correct in first time


  }
}
