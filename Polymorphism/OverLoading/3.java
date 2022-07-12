class Parent{

  void m1(int a,int b){

    System.out.println("int int Method");
  }

  void m1(int d,int e){

    System.out.println("int int Method");
  }

  void m1(float a,float b){

    System.out.println("Float float Method");
  }

  void m1(int a,float b){

    System.out.println("int float method");
  }

  void m1(float a,int b){

      System.out.println("float int method");
  }

  public static void main(String []args){
    Parent p = new Parent();
    p.m1(10,10);//int - int
    p.m1(12.34f,13.23f);//float-float
    p.m1(12.33f,124);//float int
    p.m1('a',24);//int int
    p.m1(24,'1');//int int
    p.m1(23.44f,'d');//float int

    p.m1();

  }

}
