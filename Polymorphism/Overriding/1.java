class Parent{

  void Career(){

    System.out.println("Doctor");
  }

  void Property(){
    System.out.println("bangla / gadi");

  }
}

class child extends Parent{

  void Career(){

    System.out.println("Engineer");
  }
}

class Kaka{

  public static void main(String []args){

    Parent p = new Parent();
    p.Career();//doctor
    p.Property();//bangla


    child c = new child();
    c.Career();//engineer
    c.Property();//bangla

    Parent obj = new child();
    obj.Career();//engineer
    obj.Property();//bangla
  }
}
