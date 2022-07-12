class IfelseDemo {

  public static void main(String []args){

    int x = 10;
    int y = 11;

    if(++x <= y++){                                  //true

      System.out.println("In if statement");
      System.out.println("x = "+x);
      System.out.println("y = "+y);

    } else {                                    //not execute

      System.out.println("In ELSE statement");
      System.out.println("x = "+x);
      System.out.println("y = "+y);

    }

    System.out.println("Out of  if-else");     //execute
  }
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/Statement/If$ javac ifelse2.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/Statement/If$ java IfelseDemo
In if statement
x = 11
y = 12
Out of  if-else
*/
