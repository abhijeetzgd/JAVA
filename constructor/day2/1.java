class IPL {

  private String playerName = "KLRahul";
  private int runs = 579;

  IPL(){

    System.out.println("In argument Constructor");
  }

  IPL(String playerName,int runs ){

    System.out.println("In parameterised constructor");
    this.playerName = playerName;
    this.runs =  runs;
  }

  void display(){

    System.out.println("Name = "+playerName);
    System.out.println("Runs = "+runs);

  }

}

class IPL2020{

  public static void main(String []arg){

    IPL obj1 = new IPL();
    obj1.display();

    IPL obj2 = new IPL("Mayank",550);
    obj2.display();

  }
}
