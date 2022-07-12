interface Outer {

  void m1();

  interface Inner{

    void m2();
  }
}

class xyz implements Outer,Outer.Inner{

  public void m1(){
    System.out.println("overrriding m1() of outer")
  ;}

      public void m2(){
      System.out.println("overrriding m2() of inner")
  ;  }
}

class Test {

public static void main(String []args){

  Outer o = new xyz();
  o.m1();
  Outer.Inner i = new xyz();
  i.m2();

  xyz obj = new xyz();
  obj.m1();
  obj.m2();
}
}
