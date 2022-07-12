class Kutumb{

  int mob=1;
  int laptop=1;
  static int tv=1;

  void display(){

    System.out.println("In Display");

  }

  static void statDisplay(){

    System.out.println("In Static Display");

  }

  public static void main(String [] uru){
    statDisplay();
    Kutumb.statDisplay();
    Kutumb obj1 =new Kutumb();
    obj1.display();

/*
    Kutumb obj2 =new Kutumb();
    obj2.display();
    obj2.display();
*/
  }
}
