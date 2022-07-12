class Outer{

  class inner1{

    class inner2{

        void m1(){
          System.out.println("In inner2 class");
        }
    }

    void m1(){

          System.out.println("In inner1 class");
    }
  }
  public static void main(String []args){

    new Outer().new inner1().new inner2().m1();
    new Outer().new inner1().m1();

  }
}
