//because of super it call parent class constructor first then executes its own;

class Icc {

  Icc (){
    System.out.println("Icc Constructor");
  }
}
class Bcci extends Icc{

  Bcci (){
    System.out.println("BccI Constructor");
  }
}

class Ipl extends Bcci{

  Ipl (){
    System.out.println("Ipl Constructor");
  }
}

class match {

  public static void main(String []args){
    Ipl ipl2020 = new Ipl();
  }
}
