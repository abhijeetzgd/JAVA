//Multiple Inheritance chalat nhi - but interface madhe chhalte
interface A{

  void m1();

}

interface B{

  void m1();
}

interface C implements A,B{

  void m1(){
    System.out.println("Class c : m1");
  }
}
