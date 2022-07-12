//outer chya instance & static method madhun inner chya instance method la call

class Outer {

  int x=109;

  class Inner {

    void Innerxyz(){

      System.out.println("instance method of inner class");
      System.out.println(x);
    }
  }

  void Outerxyz(){

    System.out.println("from outerxyz method");
    new Outer().new Inner().Innerxyz();
  }

  public static void main(String []args){

    Outer o = new Outer();
    Inner i = o.new Inner();
    i.Innerxyz();

    System.out.println("NOW from instatnce method");
    o.Outerxyz();

    }
}
