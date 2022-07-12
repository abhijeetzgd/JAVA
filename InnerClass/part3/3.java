class Outer{
  class Inner{
    void m1(){

      System.out.println("In inner class m1");
    }
  }
  public static void main(String []args){

    Outer o = new Outer();
    o = null;
    Inner i = o.new Inner();
i.m1();
  }

}
