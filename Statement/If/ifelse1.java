class IfelseDemo {

  public static void main(String []args){

    int x = 10;
    int y = 20;

    if(x < y){                                  //true

      System.out.println("X is smaller");
    } else {                                    //not execute

      System.out.println("Y is greater");
    }

    System.out.println("Out of  if-else");     //execute
  }
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/Statement/If$ javac ifelse1.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/Statement/If$ java IfelseDemo
X is smaller
Out of  if-else
*/
