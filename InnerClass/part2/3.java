//Dusarya class madhun pahilya class chya inner method la access from static and non static method;

class Outer {

  int x=10;

  class Inner {
      void innerxyz(){

        System.out.println("In Outer$Inner class");
        System.out.println("x = "+x);
      }
  }


}

class Demo{

  public static void main(String []ars){

    System.out.println("In static method");
    Outer o = new Outer();
    Outer.Inner i = o.new Inner();
    i.innerxyz();
    System.out.println("x = "+o.x);

    Demo d= new Demo();
    d.demoxyz();

  }

  void demoxyz(){

    System.out.println("In non-static method");
    new Outer().new Inner().innerxyz();
    System.out.println("x = "+new Outer().x);

  }
}
