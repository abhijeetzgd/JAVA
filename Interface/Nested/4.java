//interface in class

class outer {

  void m1(){

    System.out.println("IN m1 method");
  }

  interface inner {

    void m2();

  }
}

class xyz extends outer implements outer.inner{


    void m1(){
      System.out.println("overriden m1");
    }

  public  void m2(){
      System.out.println("overriden m2");
    }
}

class Test{

  public static void main(String []args){

    outer o = new xyz();
    o.m1();
  //  o.m2();

    outer.inner i = new xyz();
    //i.m1();
    i.m2();

    xyz obj = new xyz();
    obj.m1();
    obj.m2();

    outer o1 = new outer();
    o1.m1();
    
  }
}
