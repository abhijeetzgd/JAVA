class Covid19{
  Covid19(){//covid19 constructor
    System.out.println("class Covid19 constructors");
  }
}

class Lockdown extends Covid19{
  Lockdown(){
    System.out.println("In Lockdown Constructor");
  }

  public static void main(String [] args){
    System.out.println("Lockdown extends till 31st june");
    Covid19 obj = new Covid19();
    System.out.println("return back to lockdown from Covid19 constructor");
    Lockdown obj2 = new Lockdown();
  }
}
/*
OUTPUT:
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/javaTutionCode/2nd une$ javac pr4.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/javaTutionCode/2nd une$ java Lockdown
Lockdown extends till 31st june
class Covid19 constructors
return back to lockdown from Covid19 constructor
class Covid19 constructors
In Lockdown Constructor
*/
