import java.lang.*;
class year2020{

  int x=10;
  /*this is instance variable of class which is initialise with 10
  *but actually that initialization takes place in Constructor as shown in byte code
  */

  year2020(){//constructor - use fo initialization of instance variable
    super();//it will call Constructor of parent class that is object class(parent of class Eg.lord shiva)
    System.out.println("In Constructor year 2020");
  }

  public static void main(String [ ] args){
    year2020 obj = new year2020();//as here object is created it will implicitly call Constructor of class
    System.out.println("<<<<Danger>>>>");
  }
}
