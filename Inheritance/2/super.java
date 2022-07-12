class Parent{

  int x=10;

  Parent(){
    super();
    System.out.println("Parent Constructor");
  }

  void m1(){
    System.out.println("Parent M1 Method");
  }
}

class Child extends Parent{

  int x=20;

  Child(){

    System.out.println("In Child class Constructor");
  }

  void m1(){
    System.out.println("In Child M1");
  }

  public static void main(String []args){

    System.out.println("Child object");
    Child c = new Child();
    c.m1();


    System.out.println("Parent object");
    Parent p =  new Parent();
    p.m1();

    System.out.println(">>>>>>>>>>");
    Parent obj = new Child();
    obj.m1();
  }
}
