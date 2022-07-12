class BCCI {
  int x =10;
  BCCI(){

    System.out.println("In BCCI Constructor");
  }

  void rulesBCCI(){

    System.out.println("Rules By BCCI");
  }
}

class IPL extends BCCI{

  int y=20;

  IPL(){

    System.out.println("In IPL Constructor");
  }

  void rulesIPL(){

    System.out.println("rules by IPL");
  }
}


class Match{

  public static void main(String []ar){
      IPL obj = new IPL();
    BCCI obj2 = new BCCI();
      obj.rulesIPL();
      obj.rulesBCCI();

      obj2.rulesBCCI();
obj2.rulesIPL();
  }
}
