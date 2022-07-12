//Inner classs chya aat static content chalat nhi

class Outer{

  class Inner{

    static int x=10;
  }
}
/*
4.java:7: error: Illegal static declaration in inner class Outer.Inner
    static int x=10;
               ^
  modifier 'static' is only allowed in constant variable declarations
1 error
*/
