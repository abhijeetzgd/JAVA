class IfDemo {

  public static void main(String [] args) {

    int x=10;

    if(x++ <= 10){                  //True    x will 10 and then incremented
      System.out.println("Hii");
    }

    System.out.println("Hello");
  }
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/Statement/If$ javac 4.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/Statement/If$ java IfDemo
Hii
Hello
*/
