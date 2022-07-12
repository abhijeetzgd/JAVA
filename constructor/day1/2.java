class CS{

  String name = "Rahul";
  int age = 29;

  CS(){
    System.out.println("In CS Constructor");
  }

  void display(){
    System.out.println("Name = "+name);
    System.out.println("Age = "+age);

  }
}

class Student{

  public static void main(String arr[]){

    CS rahul = new CS();
    rahul.display();
    System.out.println();

    CS kanha = new CS();
    kanha.display();

    System.out.println();

    kanha.name="kanha";
    kanha.age=19;
    kanha.display();

  }
}
