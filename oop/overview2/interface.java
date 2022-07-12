interface Yewale{

  void makingTea();

}

class PuneYewale implements Yewale{

public  void makingTea(){
    System.out.println("Opens at 5am");
  }
}

class Malegaon implements Yewale{

  public void makingTea(){
    System.out.println("Opens at 7 am");
  }
}

class Chaha {

  public static void main(String []args){

    Yewale y = new PuneYewale();
    y.makingTea();

    Yewale y2 = new Malegaon();
    y2.makingTea();

  }
}
