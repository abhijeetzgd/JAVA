/* accesing innerclass instance method in outer class main method*/


class Outer {

  int x =10;

  class Inner {

    void xyz(){

      System.out.println("in inner class");
      System.out.println(x);

    }
  }

  public static void main(String []args){

    Outer o = new Outer();
    System.out.println(o.x);
    Inner i = o.new Inner();
    i.xyz();
  }
}
