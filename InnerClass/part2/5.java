//accessing static content in inner class

class Outer {

  int x=10;
  static int y=101;

  class Inner {

    void abc(){
      System.out.println("x = "+x);
      System.out.println("y = "+y);

    }
  }

  public static void main(String []args){
    new Outer().new Inner().abc();
  }
}
