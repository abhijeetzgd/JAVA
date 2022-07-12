/*
*This program is to illustrate that static varible makes single copy of
static variable
*jvm firstly execute static methods and then it creates object
*static variables are also known as class variables
*static methods are also known as class methods
*/
class print {
  static int x=10;//instance variable

  void display(){
    System.out.println(x);
  }
}

class Static{

  public static void main(String args[]){
      print obj1 =new print();
      print obj2 =new print();

      System.out.println("x = "+print.x);
      System.out.println("x = "+print.x);

      System.out.println("now we increment obj1.x by 10 ");
      print.x=print.x+10;

      System.out.println("obj1.x = "+print.x);
      System.out.println("obj2.x = "+print.x);

  }
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/MyPractice/Methods$ javac pr6.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/MyPractice/Methods$ java Static
x = 10
x = 10
now we increment obj1.x by 10
obj1.x = 20
obj2.x = 20
*/
