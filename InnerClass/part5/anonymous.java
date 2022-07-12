//Anonymous class example

class Trip {
  Trip(){
    System.out.println("in trip constructor");
  }
  void place(){

    System.out.println("Goa is on!!");

  }
}

class Today {

  public static void main(String []args){

    Trip obj = new Trip(){
      void place(){
        System.out.println("Alibag is on!!");

      }
    };
    obj.place();
  }
}
