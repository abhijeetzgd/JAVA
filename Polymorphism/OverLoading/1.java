class Parent{

  void m1(int a){
    System.out.println("In m1 method int parameter");
  }

  void m1(float b){
    System.out.println("In M1 method float parameter");
  }

  void m1(double c){
    System.out.println("IN m1 Double Method");
  }

  public static void main(String []args){
    Parent p = new Parent();
    p.m1(10);
    p.m1('a');
    p.m1(10.2);
  }

}
