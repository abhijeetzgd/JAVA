class Parent{

  String Career(){

    System.out.println("Doctor");
    return null;
  }

  void Property(){
    System.out.println("bangla / gadi");

  }
}

class child extends Parent{

  Object Career(){

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
