class IndianDefence{

  IndianDefence(){

    System.out.println("Major General Bipin Rawat");
  }

  class Army{

    void attack(){

      System.out.println("Uri Surgical Strick");
    }
  }

  class Navy{

    void attack(){

      System.out.println("Gazi attack");
    }
  }

  class Airforce{

    void attack(){

      System.out.println("Balakot AirStrike attack");
    }
  }

  public static void main(String Array[]){

    IndianDefence obj = new IndianDefence();

    IndianDefence.Army army = obj.new Army();
    army.attack();

  Airforce air = obj.new Airforce();
  air.attack();

    IndianDefence.Navy navy = obj.new Navy();
    navy.attack();

  }
}
