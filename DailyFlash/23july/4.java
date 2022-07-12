//q.4

class Human {

  public static void main(String []args){

    Human lion = null;//will creat reference only
    Human tiger = null;//will creat reference only
    Human puma = null;//will creat reference only
    Human monkey = new Human();//this will creat actual object because of new keyword

    boolean isLionHuman = lion instanceof Human;//false because object is not created yet

    System.out.println("Are lion and Human of same species --> "+isLionHuman);//false

    boolean isTigerHuman = tiger instanceof Human;//false because object is not created yet

    System.out.println("Are Tiger and Human of same species -->"+isTigerHuman);//false

    boolean isPumaHuman = puma instanceof Human;//false because object is not created yet

    System.out.println("Are tiger and human of same species --> "+isPumaHuman);//false

    boolean isMonkeyHuman = monkey instanceof Human;//true because object is created

    System.out.println("Are tiger and human of same species --> "+isMonkeyHuman);//true

  }
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/23july$ javac 4.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/23july$ java Human
Are lion and Human of same species --> false
Are Tiger and Human of same species -->false
Are tiger and human of same species --> false
Are tiger and human of same species --> true
*/
