class IfDemo {

  public static void main(String [] args) {

    int x=10;
    int y=20;

    if(x && y){                  //Erro boolean value required
            System.out.println("Hii");
    }

    System.out.println("Hello");
  }
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/Statement/If$ atom 5.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/Statement/If$ javac 5.java
5.java:8: error: bad operand types for binary operator '&&'
    if(x && y){                  //True
         ^
  first type:  int
  second type: int
1 error
*/
