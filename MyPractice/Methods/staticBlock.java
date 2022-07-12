/*
*This program ellustrate that static block executed first
*entry point function is  executed after static StaticBlock
*/

class StaticBlock{

  public static void main(String args[]){
    System.out.println("I am in static Method main");
    demo();
  }
  static{
    System.out.println("I am in static block");
  }

  static void demo(){
    System.out.println(" I am in static method demo ");
  }
}
