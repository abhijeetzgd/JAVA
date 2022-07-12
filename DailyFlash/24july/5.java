class Student {
  void isEligible(int attendance){
    if(attendance >=75){
      System.out.println("Student attendance is"+attendance);
      System.out.println("Procesing...");
      System.out.println("and he is Eligible for exam");
    } else {
      System.out.println("Student attendance is"+attendance);
      System.out.println("Procesing...");
      System.out.println("and he is not Eligible for exam");

    }
  }
}

class Exam {

  public static void main(String []args){

    Student tushar = new Student();
    tushar.isEligible(67);
  }
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/24july$ javac 5.java
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/24july$ java Exam
Student attendance is67
Procesing...
and he is not Eligible for exam
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/DailyFlash/24july$
*/
