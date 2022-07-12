class Zomato {

  static void Order(){
    System.out.println("In order Method");

    class Hotels{

      String hotelname = null;

      Hotels(String name){

        this.hotelname= name;
      }

      void orderPlaced(){

        System.out.println("Order placedd at = "+hotelname);

        
      }
    }

    Hotels h = new Hotels("greenpark");
    h.orderPlaced();
  }

  void goout(){

    System.out.println("Book table");


    }
  }
  public static void main(String []args){

    Zomato z = new Zomato();

    z.Order();
  }
}
