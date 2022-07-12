abstract class Biryani{

abstract  void quanteti();
abstract  void price();

  void test(){

    System.out.println("Always best test");

  }
}

class Pk extends Biryani{

  void quanteti(){

    System.out.println("LArge quanteti");
  }

  void price(){
    System.out.println("Low Price");

  }
}

class Barkat extends Biryani{

  void quanteti(){

    System.out.println("small quanteti");
  }

  void price(){
    System.out.println("high Price");

  }
}

class Abhijeet{

  public static void main(String []args){

  //  Biryani b = new Biryani();
    Pk p = new Pk();
    Barkat b = new Barkat();
  }
}
