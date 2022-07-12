class Core2web{

  Core2web(){

    System.out.println("In core2web Constructor");
  }

  void learning(){

    System.out.println("In core2web learning method");
  }
}

class Network extends Core2web{

  Network(){

    System.out.println("In Network Constructor");
  }

  void community(){

    System.out.println("In Network community method");
  }
}


class Incubetor extends Core2web{
/*
  Incubetor(){

    System.out.println("In Incubetor Constructor");
  }
*/
  void Implementation(){

    System.out.println("In Incubetor Implementation method");
  }
}

class Student{

  public static void main(String [] args){

//    Core2web c2w = new Core2web();
//    c2w.community(); //error-parent object cannot acces child method

  //  Core2web abhijeet = new Incubetor();
//    abhijeet.Implementation();//error-core2web cha ref ahe but core2web kade Implementation navachi method nhi.

    Incubetor ibtr = new Incubetor();
    ibtr.Implementation();
  }
}
