//Q.2
class Instagram {

  int post_count=10;
  static String result;

  void post(){

    System.out.println("Post Count = "+post_count);
  }

  static void check(Instagram reel){

    result= (reel instanceof Instagram)? "yes" : "No";
    System.out.println("reel is belongs of Instagram - "+result);
  }
}

class Facebook {

  public static void main(String []args){

        Instagram reel = new Instagram();
        reel.check(reel);
        reel.post();
  }

}
/*output
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/23july$ java Facebook
reel is belongs of Instagram - yes
Post Count = 10
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/23july$
*/
