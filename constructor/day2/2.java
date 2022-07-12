class BCCI {

  String pname = "Ganguli";
  int years = 2;

  BCCI(){

    System.out.println("IN BCCI constructor");
  }
}

class IPL extends BCCI{


  IPL(){

    System.out.println("IN IPL constructor");

  }

  IPL(BCCI obj){

    System.out.println("IN parameter constructor");
    System.out.println("President = "+obj.pname);
    System.out.println("year = "+years);

  }
}

class ipl2020 {

  public static void main(String []args){

    IPL obj1 = new IPL();

    BCCI b = new BCCI();

    IPL obj2 = new IPL(b);
  }
}
