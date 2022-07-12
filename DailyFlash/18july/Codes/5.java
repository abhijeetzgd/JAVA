/*
Program 5: Write 2 classes as Pune, Mumbai. Add the following things:
class Pune :
static variable : int covidActiveCases
instance variable : int totalCases
static method : noCorona
instance method : lockdown
noLockdown

class Mumbai :
static variable : int covidActiveCases
instance variable : int totalCases
static method : noCorona
instance method : lockdown
noLockdown

  }
Increment both the variables in non-static method. Call non-static methods twice,
display the output and observe the changes. Draw JVM architecture for the same.
*/

class Pune{
  static int covidActiveCases=50000;
  int totalCases=100000;

  static void nocorona(){

    System.out.println("no corona");
    System.out.println("Covid Active Cases"+covidActiveCases);

  }

  void lockdown(){

    covidActiveCases = 100;
    totalCases=1000;

    System.out.println("!!Lockdown!!");
    System.out.println("Covid Active Cases"+covidActiveCases);
    System.out.println("Total Cases"+totalCases);

  }

  void noLockdown(){

    covidActiveCases = 11100;
    totalCases=49000;

    System.out.println("!!No Lockdown!!");
    System.out.println("Covid Active Cases"+covidActiveCases);
    System.out.println("Total Cases"+totalCases);

  }

}

class Mumbai{
  static int covidActiveCases=40000;
  int totalCases=90000;

  static void nocorona(){
    System.out.println("no corona");
    System.out.println("Covid Active Cases"+covidActiveCases);
  }

  void lockdown(){
    covidActiveCases = 400;
    totalCases=1200;
    System.out.println("!!Lockdown!!");
    System.out.println("Covid Active Cases"+covidActiveCases);
    System.out.println("Total Cases"+totalCases);
  }

  void noLockdown(){
    covidActiveCases = 11100;
    totalCases=49000;
    System.out.println("!!No Lockdown!!");
    System.out.println("Covid Active Cases"+covidActiveCases);
    System.out.println("Total Cases"+totalCases);
  }
}

class Corona{
  public static void main(String  [] args){
    System.out.println("Pune");
    Pune p1 = new Pune();
    p1.nocorona();
    p1.lockdown();
    p1.noLockdown();
    System.out.println("Mumbai");
    Mumbai m1 =new Mumbai();
    m1.nocorona();
    m1.lockdown();
    m1.noLockdown();
  }
}
