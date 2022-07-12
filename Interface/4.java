interface A{

  void m1();
}

interface B extends A{

  void m2();
}

class AB implements B{

  public void m1(){
    System.out.println("IN M1");
  }
  public void m2(){

    System.out.println("IN M2");
  }
}

class Test {

  public static void main(String [] Abhijeet){

    AB obj = new AB();
    obj.m1();//IN M1
    obj.m2();//IN M2


        A obj1 = new AB();
        obj1.m2();//error
        obj1.m1();//IN M1
  }
}
