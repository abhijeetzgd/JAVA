class Company{

  String cmpname  = "BMC";
  private String name ="Rahul";
  private int age = 28;

  Company(){

    System.out.println("In No argumnet Constructor");
  }

  Company(String empName,int empAge){

    System.out.println("In paramettrised Constructor");
    name = empName;
    age = empAge;
  }

  void display(){

    System.out.println("Company = "+cmpname);
    System.out.println("NAme = "+name);
    System.out.println("Age = "+age);

  }
}

class Emp{

  public static void main(String []args){

    Company rahul = new Company();
    rahul.display();
    System.out.println();

    Company kanha = new Company("Kanha",18);
    kanha.display();

  }
}
