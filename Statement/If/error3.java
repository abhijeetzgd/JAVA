class Error {

  public static void main(String [] args) {

      int x= 10;

      if(x < 10){
          System.out.println("In if statement");
          System.out.println("Hello");
        }
          System.out.println("out of if statement");
        else {                                            //error
            System.out.println("In Else statement");
            System.out.println("Hiii");
          }
  }
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/Statement/If$ javac error3.java
error3.java:12: error: 'else' without 'if'
        else {
        ^
1 error
*/
