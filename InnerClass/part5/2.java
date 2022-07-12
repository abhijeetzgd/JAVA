//accessing static and non static variable in static class

class Hospital{

static int y =20;
  int x =10;

  static class Doctor {

    int p=30;
    static int q=40;

    void serviceAt(){
      System.out.println("Currently at adhar hospital");
      System.out.println("Y = "+y);
      System.out.println("X = "+new Hospital().x);
      System.out.println("p = "+p);
      System.out.println("q = "+q);

    }
  }

  public static void main(String []ag){

    //Hospital adhar = new Hospital();
    Doctor shashi = new Doctor();
    shashi.serviceAt();
  }
}
