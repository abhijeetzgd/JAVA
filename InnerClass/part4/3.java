class Zomato {
//  static int y =20;

  void Order(){
    int x =10;

    System.out.println("In order Method");

    class Hotels{

      String hotelname = null;

      Hotels(String name){

        this.hotelname= name;
      }

      void orderPlaced(){


        System.out.println("Order placedd at = "+hotelname);
        System.out.println("X = "+x);
  //      System.out.println("Y = "+y);

      }
    }

    Hotels h = new Hotels("greenpark");
    h.orderPlaced();
  }

  void goout(){

    System.out.println("Book table");

    class xyz{
       class abc{
          class mno{

          }
       }

    }
  }
  public static void main(String []args){

    Zomato z = new Zomato();

    z.Order();
  }
}
