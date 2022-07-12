class Covid19{
  Covid19(){//covid19 constructor
    System.out.println("class Covid19 constructors");
  }
}

class Lockdown extends Covid19{

  public static void main(String [] args){

    System.out.println("Lockdown extends till 31st june");
    Covid19 obj = new Covid19();
    System.out.println("return back to lockdown");
  }
}
/*output
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/javaTutionCode/2nd une$ javac pr3.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/javaTutionCode/2nd une$ java Lockdown
Lockdown extends till 31st june
class Covid19 constructors
return back to lockdown
*/
