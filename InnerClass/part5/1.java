//static nasted inner class examplw

class Hospital{

  static class Doctor {

    void serviceAt(){
      System.out.println("Currently at adhar hospital");
    }
  }

  public static void main(String []ag){

    //Hospital adhar = new Hospital();
    Doctor shashi = new Doctor();
    shashi.serviceAt();
  }
}
