class Parent {

final  void carrer(){

    System.out.println("Doctor\n");
  }

  void Property(){

    System.out.println("GAdii bangla\n");
  }
}
class child extends Parent{

   void carrer(){

    System.out.println("Engineer\n");
  }
}

class kaka{

  public static void main(String []args){

    Parent obj = new child();
    obj.carrer();
  }
}
