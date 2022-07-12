class E2007{

//instance variable declair
  int mob=1;
  int laptop=1;

//staic variable declair
  static int tv=1;

  void abhiMethod(){

    System.out.println("In ABHIJEET Method");
    System.out.println("MOBILE = "+mob);
    System.out.println("laptop = "+laptop);
    System.out.println("tv = "+tv);

  }

  void rahulMethod(){

    System.out.println("In RAHUL Method");
    System.out.println("MOBILE = "+mob);
    System.out.println("laptop = "+laptop);
    System.out.println("tv = "+tv);

  }

  public static void main(String [] uru){

    E2007 abhi = new E2007();
    abhi.tv=0;
    abhi.abhiMethod();

    E2007 rahul =new E2007();
    abhi.tv=1;
    rahul.rahulMethod();
  }

}
