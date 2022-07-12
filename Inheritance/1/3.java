//Multiple Inheritance chalat nhi
class A{

  void m1(){
    System.out.println("Class A : m1");
  }
}

class B{

  void m1(){
    System.out.println("Class B : m1");
  }
}

class C extends A,B{

  void m1(){
    System.out.println("Class c : m1");
  }
}
