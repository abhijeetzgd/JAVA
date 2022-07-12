class Parent{

  void Career(){

    System.out.println("Doctor");
  }

  void Property(){
    System.out.println("bangla / gadi");

  }
}

class child extends Parent{

  String Career(){

    System.out.println("Engineer");
    return null;
  }
}

class Kaka{

  public static void main(String []args){

    
    Parent obj = new child();
    obj.Career();//engineer
    obj.Property();//bangla
  }
}
