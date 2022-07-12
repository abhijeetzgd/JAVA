class outer {

  class inner{

    void m1(){

      System.out.println("In m1 Method");
    }
  }

public static void main(String []args){

  outer o1 = new outer();
  outer o2 = new outer();

  inner i = o2.new inner  ();

}
}
