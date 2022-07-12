class IfDemo {

  public static void main(String [] args) {

    int x=10;

    if(++x <= 10){                  //false
      System.out.println("Hii");
    }

    System.out.println("Hello");
  }
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/Statement/If$ javac 3.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/Statement/If$ java IfDemo
Hello
*/
