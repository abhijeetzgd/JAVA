interface Mumbai{

  static void quality(){
      System.out.println("BEST Quality");
    }
void price();
}

class SunilShop implements Mumbai{


    public void price(){
      System.out.println("500rs");

    }
}

class TilakRoad implements Mumbai{


    public void price(){
      System.out.println("1000rs");

    }
}

class Boy{

  public static void main(String []args){

    Mumbai s = new SunilShop();
    Mumbai.quality();
    s.price();

    Mumbai T = new TilakRoad();
    Mumbai.quality();
    T.price();


  }
}
