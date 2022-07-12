abstract class Pappa{

  Pappa(){
    System.out.println("Constructor of Pappa");
  }
  void getProperty(){

    System.out.println("Gadi,Bangla");
  }

  abstract void marry();
}

class Abhijeet extends Pappa{

  void marry(){

    System.out.println("Kriti sEnon");
  }
}

class Demo{

  public static void main(String []args){

    Abhijeet a = new Abhijeet();
    a.getProperty();
    a.marry();

    }

  
}
