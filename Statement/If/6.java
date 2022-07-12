class IfDemo {

  public static void main(String [] args) {

    boolean x=10;                         //Error -only T or F
    boolean y=20;                         //boolean can not converted to int

    if(x && y){
            System.out.println("Hii");
    }

    System.out.println("Hello");
  }
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/Statement/If$ atom 6.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/Statement/If$ javac 6.java
6.java:5: error: incompatible types: int cannot be converted to boolean
    boolean x=10;                         //Error -only T or F
              ^
6.java:6: error: incompatible types: int cannot be converted to boolean
    boolean y=20;                         //boolean can not converted to int
              ^
2 errors
*/
