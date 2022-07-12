class Pappa{

  void getProperty(){

    System.out.println("Bangla,gadi");
  }

  void career(){

    System.out.println("Doctor");
  }

  void marry(){

    System.out.println("Dipika");
  }
}

class Abhijeet extends Pappa{

  void career(){

    System.out.println("Engineer");
  }

  void marry(){

    System.out.println("Kiara");
  }
}

class Kaka{

  public static void main(String []args){

    Pappa p = new Pappa();
    p.getProperty();//bangla gadi
    p.career();//doctor
    p.marry();//dipika

    Abhijeet a = new Abhijeet();
    a.getProperty();//bangla gadi
    a.career();//Engineer
    a.marry();//kiara

    Pappa obj = new Abhijeet();

    obj.getProperty();//bangla gadi
    obj.career();//Engineer
    obj.marry();//kiara

    Abhijeet obj2 = new Pappa();
    obj2.getProperty();//bangla gadi
    obj2.career();//Engineer
    obj2.marry();//kiara

}
}
