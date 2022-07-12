
/*
find the number is even or odd using ternary operator.
*/
class Demo {
  public static void main(String []args){
  int a=10;
  String res =null;

  res = (a%2==0)?"10 is even" : "10 is odd";

  System.out.println(res);
}
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/23july$ javac 1.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/23july$ java Demo
10 is even

*/
