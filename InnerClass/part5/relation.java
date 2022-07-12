class parent {

  parent(){
    System.out.println("parent cnstructor");
  }
}

class child{

  child(){
    System.out.println("child constructor");
  }

  public static void main(String []args){

    parent p  = new parent();
    child c = new child();
    parent p1 = new child();
  }
}
