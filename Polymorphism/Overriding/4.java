class GrandPaa{

  void Marry(){

    System.out.println("In GrandPaa Marry");
  }
}

class Father extends GrandPaa{

  abstract void Marry();
}

class Son extends Father{

  void Marry(){

    System.out.println("Son choice");
  }

  public static void main(String []ars){

    Father f = new Son();
    f.Marry();
  }
}
