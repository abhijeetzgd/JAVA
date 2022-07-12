class MultipleStaticBlock{

  static {
    System.out.println(" We are in static block above main");

  }
  public static void main(String args[]){

    System.out.println(" We are in static method main");

  }
  static {
    System.out.println(" We are in static block below main");

  }
}
/*
output
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/MyPractice/Methods$ javac multipleStaticBlock.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/MyPractice/Methods$ java MultipleStaticBlock
 We are in static block above main
 We are in static block below main
 We are in static method main
*/
