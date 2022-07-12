/*
Program 2: Write a Real-Time Java Program that has three classes as Indian Army,
Indian Navy & Indian Air Force, declare static & Instance Methods and Variables are
call them from main method. Moreover, draw the JVM architecture to that program
as well.
*/

class IndianArmy{
  static int ArmyCount= 1237117;


  void info(){
    System.out.println("Land based branch.");
  }

  void Headquarter(){
    System.out.println("Headquarter is at new Delhi");
  }

}

class IndianNavy{
  static int navyCount= 67228;

  void info(){
    System.out.println("Sealift defence deterrence");
  }

  void Headquarter(){
    System.out.println("Integrated Headquarters,ministry of Defence(Navy)");
  }
}

class IndianAirforce{
  static int AirforceCount= 67228;
  void info(){
    System.out.println("Air defence deterrence");
  }

  void Headquarter(){
    System.out.println("Headquarter is at new Delhi");
  }

}

class India{

  public static void main(String []args){
    IndianArmy demo1 = new IndianArmy();
    System.out.println("Indian Army count:"+demo1.ArmyCount);
    demo1.info();
    demo1.Headquarter();

    IndianNavy demo2 = new IndianNavy();
    System.out.println("Indian Navy count:"+demo2.navyCount);
    demo2.info();
    demo2.Headquarter();

    IndianAirforce demo3 = new IndianAirforce();
    System.out.println("Indian Airforce count:"+demo3.AirforceCount);
    demo3.info();
    demo3.Headquarter();
  }
}
