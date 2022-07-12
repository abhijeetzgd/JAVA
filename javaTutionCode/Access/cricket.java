class t20{

  int toss=0;
  static String capt="VIRAT KOHLI";

  static void list(){

    System.out.println("List of players");
    System.out.println(capt);
    t20 firstmatch =new t20();

    System.out.println(firstmatch.toss);//error

  }
  void batORBowl(){

    System.out.println("Decision");
    System.out.println(capt);
    System.out.println(toss);
  }

  public static void main(String args[] ){

    list();
    t20 firstmatch =new t20();
    firstmatch.batORBowl();
  }

}
