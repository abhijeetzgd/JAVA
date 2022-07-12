class Demo{

  void m1(String name){

    System.out.println("In M1 String Method");
  }

  void m1(StringBuffer name){

    System.out.println("In M1 String Buffer Method");
  }

  public static void main(String []args){

    Demo obj =  new Demo();
    obj.m1("shashi");

    obj.m1(new StringBuffer ("Manoj"));

    obj.m1(null);
  }
}
