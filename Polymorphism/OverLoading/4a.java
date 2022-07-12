class Demo{

  void m1(Object o){

    System.out.println("in object Method");
  }

  void m1(String nae){

    System.out.println("In String Method");
  }

  public static void main(String []args){

    Demo d = new Demo();
    d.m1(null);
    d.m1("Shashi");

  //  d.m1( Object o);
  }
}
