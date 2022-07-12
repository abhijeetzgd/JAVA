/*
This program is to illustrate that instace varible makes saparate copy of
instace variable
*/ 
class print {
  int x=10;//instance variable

  void display(){
    System.out.println(x);
  }
}

class instance{

  public static void main(String args[]){
      print obj1 =new print();
      print obj2 =new print();

      System.out.println("obj1.x = "+obj1.x);
      System.out.println("obj2.x = "+obj2.x);

      System.out.println("now we increment obj1.x by 10 ");
      obj1.x=obj1.x+10;

      System.out.println("obj1.x = "+obj1.x);
      System.out.println("obj2.x = "+obj2.x);


  }
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/MyPractice/Methods$ javac pr5.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/MyPractice/Methods$ java instance
obj1.x = 10
obj2.x = 10
now we increment obj1.x by 10
obj1.x = 20
obj2.x = 10
*/
