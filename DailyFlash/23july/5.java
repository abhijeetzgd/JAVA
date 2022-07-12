class Earth{

  public static void main(String []args){

    Earth me = new Earth();
    Earth moon = null;

    System.out.println("Me instance of earth: "+(me instanceof Earth));
  }
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/23july$ javac 5.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/23july$ java Earth
Me instance of earth: true
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/23july$
*/
