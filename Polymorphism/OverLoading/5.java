class Demo{

  void m1(int x){

    System.out.println("Int MEthod");
  }

  void m1(int x,int y){

    System.out.println("Two int MEthod");
  }

  void m1(int ...args){

    System.out.println("var args int MEthod");
  }

  public static void main(String []args)  {

    Demo d = new Demo();
    d.m1(10);
    d.m1(12,23);
    d.m1(1,34,6);
  }


}
