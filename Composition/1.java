class Doctor{

  String drName = "MK shah";
  int visit = 7;

  void operation(){

    System.out.println("Neuro - Surgen");
  }
}

class Hospital{

  int tolDoct = 34;
  String name = "Sancheti";
  Doctor obj = new Doctor();

  void service(){

    System.out.println("Hospital name = "+name);
    System.out.println("total Doctor = "+tolDoct);
    System.out.println("Good Service");
    visitorDoctor();
  }

  void visitorDoctor(){

    obj.operation();
  }

}

class Patient {

  public static void main(String [] args){

    Hospital h = new Hospital();
    h.service();
  }
}
