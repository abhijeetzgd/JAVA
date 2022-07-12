class Core2web {


}
class Biencaps extends Core2web{


}

class demo{

  void m1(Core2web c2w){

    System.out.println("Core2web Parameter");
  }

  void m1(Biencaps bie){

    System.out.println("Biencaps Parameter");
  }
}

class Test {

  public static void main(String []args){
    demo d = new demo();
    Core2web c2w = new Core2web();
    d.m1(c2w);

    Biencaps bie =  new Biencaps();
    d.m1(bie);

//    Core2web obj = new Biencaps();
    Biencaps obj = new Core2web();
    d.m1(obj);
  }
}
