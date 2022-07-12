/*Write a program to check that user is eligible for voting or not */

class check {

  public static void main(String []args){

      int age = 17;
      String result;

      result = (age > 17)?"user is eligible for voting" :"user is not eligible for voting";

      System.out.println(result);

}
}


/* output
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/23july$ java check
user is not eligible for voting
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/23july$ java check
*/
